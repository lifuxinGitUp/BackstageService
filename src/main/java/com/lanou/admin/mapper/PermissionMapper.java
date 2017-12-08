package com.lanou.admin.mapper;

import com.lanou.admin.bean.Group;
import com.lanou.admin.bean.Permission;

import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
public interface PermissionMapper {
    List<Group> findAllGroup();
    List<Permission> findAllPermission();
    Group findGroupById(int groId);
    void addPermission(Permission per);
}
