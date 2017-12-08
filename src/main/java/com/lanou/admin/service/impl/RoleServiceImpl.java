package com.lanou.admin.service.impl;

import com.lanou.admin.bean.Role;
import com.lanou.admin.mapper.RoleMapper;
import com.lanou.admin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Qualifier("roleMapper")
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public int addRole(Role role) {
        int roleId = roleMapper.addRole(role);
        if (role.getPermissions().size() != 0){
            addRolePer(role);
        }
        return roleId;
    }

    @Override
    public void addRolePer(Role role) {
        roleMapper.addRolePer(role);
    }

    @Override
    public List<Role> findAllRole() {
        return roleMapper.findAllRole();
    }
}
