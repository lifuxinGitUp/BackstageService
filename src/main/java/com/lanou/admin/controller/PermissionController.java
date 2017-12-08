package com.lanou.admin.controller;

import com.lanou.admin.bean.Group;
import com.lanou.admin.bean.Permission;
import com.lanou.admin.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by dllo on 17/12/5.
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Qualifier("permissionService")
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/addPermissionPage")
    public String goAddPermissionPage(){
        return "admin/admin-permission-add";
    }

    @ResponseBody
    @RequestMapping("/findAllGroup")
    public List<Group> findAllGroup(){
        return permissionService.findAllGroup();
    }

    @ResponseBody
    @RequestMapping("/findAllPermission")
    public List<Permission> findAllPermission(){
        return permissionService.findAllPermission();
    }

    @RequestMapping("/addPermission")
    public String addPermission(int groId, Permission permission){
        Group group = permissionService.findGroupById(groId);
        permission.setGroup(group);
        permissionService.addPermission(permission);
        return null;
    }


}
