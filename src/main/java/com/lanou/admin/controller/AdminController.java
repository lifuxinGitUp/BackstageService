package com.lanou.admin.controller;

import com.lanou.admin.bean.Admin;
import com.lanou.admin.bean.Role;
import com.lanou.admin.service.AdminService;
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
@RequestMapping("/admin")
public class AdminController {
    @Qualifier("adminService")
    @Autowired
    private AdminService adminService;
    //123
    @RequestMapping(value = "/goAddAdminPage")
    public String admin_Add(){
        return "admin/admin-add";
    }

    @RequestMapping(value = "/addAdmin")
    public void addAdmin(Admin admin, String roleId){
        adminService.addAdmin(admin);
        System.out.println(admin.getAdminId());
    }
}
