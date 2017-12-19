package com.lanou.admin.test;

import com.lanou.admin.bean.Admin;
import com.lanou.admin.bean.PermissionExp;
import com.lanou.admin.service.AdminService;
import com.lanou.admin.service.RoleService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Created by dllo on 17/12/13.
 */
public class AdminTest {
    private ApplicationContext context;
    @Qualifier("adminService")
    @Autowired
    private AdminService adminService;
    @Before
    public void init(){
        /*启动spring容器*/
        context = new ClassPathXmlApplicationContext("SSM-*.xml");
        adminService = context.getBean(AdminService.class);
    }

    @Test
    public void findAdmin(){
        Admin admin = adminService.findAdminByLoginName("zhangsan");
        System.out.println(admin);
        System.out.println(admin.getRole());
        for (PermissionExp permissionExp : admin.getRole().getPermissions()) {
            System.out.println(permissionExp);
        }
    }

}
