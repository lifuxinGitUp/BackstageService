package com.lanou.main.controller;

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

    @RequestMapping(value = "/adminList")
    public String admin_List(){
        return "admin/admin-list";
    }

    @RequestMapping(value = "/adminPassword")
    public String admin_Password_Edit(){
        return "admin/admin-password-edit";
    }

    @RequestMapping(value = "/adminRole")
    public String admin_Role(){
        return "admin/admin-role";
    }

    @RequestMapping(value = "/adminPermission")
    public String admin_permission(){
        return "admin/admin-permission";
    }

    @RequestMapping(value = "/welcome")
    public String welcomePage(){
        return "welcome";
    }


    /**
     * 业主信息的跳转
     */
    // 业主信息列表
    @RequestMapping(value = "proprietorList")
    public String proprietor_List(){
        return "proprietor/proprietor-list";
    }

    // 删除的业主
    @RequestMapping(value = "proprietorDel")
    public String proprietor_Del(){
        return "proprietor/proprietor-del";
    }

    // 添加业主
    @RequestMapping(value = "proprietorAdd")
    public String proprietor_Add(){
        return "proprietor/proprietor-add";
    }

    // 显示业主信息
    @RequestMapping(value = "proprietorShow")
    public String proprietor_Show(){
        return "proprietor/proprietor-show";
    }

    // 浏览记录
    @RequestMapping(value = "proprietorCarCost")
    public String proprietor_Record_Browse(){
        return "proprietor/proprietor-car-cost";
    }





}
