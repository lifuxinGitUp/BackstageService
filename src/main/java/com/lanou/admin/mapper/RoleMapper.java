package com.lanou.admin.mapper;

import com.lanou.admin.bean.Role;

import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
public interface RoleMapper {
    int addRole(Role role);
    void addRolePer(Role role);
    List<Role> findAllRole();
}
