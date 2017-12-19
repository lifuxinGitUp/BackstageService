package com.lanou.admin.controller;

import com.lanou.admin.bean.Permission;
import com.lanou.admin.bean.PermissionExp;
import com.lanou.admin.bean.Role;
import com.lanou.admin.service.RoleService;
import com.lanou.main.bean.FormListObject;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/12/5.
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Qualifier("roleService")
    @Autowired
    private RoleService roleService;

//    @RequiresRoles("CEO")
    @RequestMapping(value = "/goAddRolePage")
    public String roleAdd(){
        return "admin/admin-role-add";
    }


    @RequestMapping(value = "/addRole")
    public String addRole(Role role){
        roleService.addRole(role);
        return null;
    }
    @ResponseBody
    @RequestMapping(value = "/findAllRole")
    public List<Role> findAllRole(){
        return roleService.findAllRole();
    }
}
