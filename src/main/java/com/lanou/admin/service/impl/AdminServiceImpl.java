package com.lanou.admin.service.impl;

import com.lanou.admin.bean.Admin;
import com.lanou.admin.mapper.AdminMapper;
import com.lanou.admin.service.AdminService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by dllo on 17/12/7.
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Qualifier("adminMapper")
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public int addAdmin(Admin admin){
        // 取UUID前4后4作为盐
        String a = String.valueOf(UUID.randomUUID());
        String b = a.substring(0,4);
        String c = a.substring(a.length()-4,a.length());
        a = b + c ;
        String pwdSalt = new Md5Hash(admin.getAdminLoginPwd(), a).toString();
        admin.setAdminLoginPwd(pwdSalt);
        admin.setAdminSalt(a);
        return adminMapper.addAdmin(admin);
    }
}
