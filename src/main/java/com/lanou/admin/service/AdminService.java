package com.lanou.admin.service;

import com.lanou.admin.bean.Admin;

import java.util.List;

/**
 * Created by dllo on 17/12/7.
 */
public interface AdminService {
    int addAdmin(Admin admin,String roleId);
    List<Admin> findAdmin(int roleId);
    Admin findAdminByLoginName(String adminLoginName);
}
