package com.lanou.admin.service;

import com.lanou.admin.bean.Group;
import com.lanou.admin.bean.Permission;

import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
public interface PermissionService {
    List<Group> findAllGroup();
    List<Permission> findAllPermission();
    Group findGroupById(int groId);
    void addPermission(Permission permission);
}
