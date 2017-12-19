package com.lanou.main.realm;

import com.lanou.admin.bean.Admin;
import com.lanou.admin.bean.PermissionExp;
import com.lanou.admin.mapper.AdminMapper;
import com.lanou.admin.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.web.subject.WebSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/12/13.
 */
public class MainRealm extends AuthorizingRealm {

    @Qualifier("adminMapper")
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public String getName() {
        return "mainrealm";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return super.supports(token);
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 授权方法
        // 认证的结果: 取出的User实体类/用户名
        String adminLoginName = (String) principalCollection.getPrimaryPrincipal();
        Admin admin = adminMapper.findAdminByLoginName(adminLoginName);
        // 2. 从数据库中获取该用户的所有角色和权限
        // 模拟
        List<String> roleList = new ArrayList<String>();
        roleList.add(admin.getRole().getRoleName());

        List<String> perList = new ArrayList<String>();
        for (PermissionExp permissionExp : admin.getRole().getPermissions()) {
            if (permissionExp.getAddPer() != 0){
                perList.add(permissionExp.getPerName()+":create");
            }
            if (permissionExp.getDeletePer() != 0){
                perList.add(permissionExp.getPerName()+":delete");
            }
            if (permissionExp.getUpdatePer() != 0){
                perList.add(permissionExp.getPerName()+":update");
            }
            if (permissionExp.getSelectPer() != 0){
                perList.add(permissionExp.getPerName()+":query");
            }
            if (permissionExp.getAuditPer() != 0){
                perList.add(permissionExp.getPerName()+":auditPer");
            }
            if (permissionExp.getOwnPer() != 0){
                perList.add(permissionExp.getPerName()+":ownPer");
            }
        }
        // 3. 将获取的权限和角色都统一起来
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(roleList);
        info.addStringPermissions(perList);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        ServletRequest request = ((WebSubject) SecurityUtils.getSubject()).getServletRequest();
        // 获得用户此次输入的用户名
        String adminLoginName = (String)authenticationToken.getPrincipal();
        // 此处应该拿username去数据库查询,是否存在该用户
        Admin admin = adminMapper.findAdminByLoginName(adminLoginName);
        if (admin == null){
            throw new UnknownAccountException("用户名不存在");
        }
        // 获取用户输入密码
        String adminLoginPwd = new String((char[]) authenticationToken.getCredentials());
        String adminLoginPwd2 = new Md5Hash(adminLoginPwd, admin.getAdminSalt()).toString();
        if (!adminLoginPwd2.equals(admin.getAdminLoginPwd())){
            throw new IncorrectCredentialsException("密码错误");
        }
        request.getServletContext().setAttribute("user", admin);
        // 返回认证成功的信息
        AuthenticationInfo info = new SimpleAuthenticationInfo(adminLoginName,adminLoginPwd,ByteSource.Util.bytes(admin.getAdminSalt()),getName());
        System.out.println(info);
        return info;
    }
}
