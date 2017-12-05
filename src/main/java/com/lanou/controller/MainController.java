package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dllo on 17/12/4.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "AddAdmin")
    public String admin_Add(){
        return "admin/admin-add";
    }

    @RequestMapping(value = "adminList")
    public String admin_List(){
        return "admin/admin-list";
    }

    @RequestMapping(value = "adminPassword")
    public String admin_Password_Edit(){
        return "admin/admin-password-edit";
    }

    @RequestMapping(value = "adminPermission")
    public String admin_Role(){
        return "admin/admin-role";
    }

    @RequestMapping(value = "adminRoleAdd")
    public String admin_Role_Add(){
        return "admin/admin-role-add";
    }

}
