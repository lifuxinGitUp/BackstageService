package com.lanou.admin.service.impl;

import com.lanou.admin.bean.Admin;
import com.lanou.admin.bean.Role;
import com.lanou.admin.mapper.AdminMapper;
import com.lanou.admin.service.AdminService;
import com.lanou.admin.service.RoleService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by dllo on 17/12/7.
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Qualifier("adminMapper")
    @Autowired
    private AdminMapper adminMapper;
    @Qualifier("roleService")
    @Autowired
    private RoleService roleService;
    @Override
    public int addAdmin(Admin admin,String roleId){
        // 取UUID前4后4作为盐
        String a = String.valueOf(UUID.randomUUID());
        String b = a.substring(0,4);
        String c = a.substring(a.length()-4,a.length());
        a = b + c ;
        String pwdSalt = new Md5Hash(admin.getAdminLoginPwd(), a).toString();
        admin.setAdminLoginPwd(pwdSalt);
        admin.setAdminJoinTime(new Date());
        admin.setAdminSalt(a);
        int id = Integer.valueOf(roleId);
        Role role = roleService.findRoleById(id);
        admin.setRole(role);
        int adminId = adminMapper.addAdmin(admin);
        adminMapper.addAdminRole(admin);
        return adminId;
    }

    @Override
    public List<Admin> findAdmin(int roleId) {
        return adminMapper.findAdmin(roleId);
    }

    @Override
    public Admin findAdminByLoginName(String adminLoginName) {
        return adminMapper.findAdminByLoginName(adminLoginName);
    }
}
