package com.lanou.admin.service.impl;

import com.lanou.admin.bean.Group;
import com.lanou.admin.bean.Permission;
import com.lanou.admin.mapper.PermissionMapper;
import com.lanou.admin.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Qualifier("permissionMapper")
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Group> findAllGroup() {
        return permissionMapper.findAllGroup();
    }

    @Override
    public List<Group> findGroup() {
        return permissionMapper.findGroup();
    }


    @Override
    public List<Permission> findAllPermission() {
        return permissionMapper.findAllPermission();
    }

    @Override
    public Group findGroupById(int groId) {
        return permissionMapper.findGroupById(groId);
    }

    @Override
    public void addPermission(Permission permission) {
        permissionMapper.addPermission(permission);
    }
}
