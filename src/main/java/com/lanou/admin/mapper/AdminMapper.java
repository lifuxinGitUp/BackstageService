package com.lanou.admin.mapper;

import com.lanou.admin.bean.Admin;

import java.util.List;

/**
 * Created by dllo on 17/12/7.
 */
public interface AdminMapper {
    int addAdmin(Admin admin);
    void addAdminRole(Admin admin);
    List<Admin> findAdmin(int roleId);
    Admin findAdminByLoginName(String adminLoginName);
}
