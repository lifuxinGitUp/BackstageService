package com.lanou.admin.test;

import com.lanou.admin.bean.Role;
import com.lanou.admin.service.RoleService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
public class RoleTest {
    private ApplicationContext context;
    @Qualifier("roleService")
    @Autowired
    private RoleService roleService;

    @Before
    public void init(){
        /*启动spring容器*/
        context = new ClassPathXmlApplicationContext("SSM-*.xml");
        roleService = context.getBean(RoleService.class);
    }


    @Test
    public void addRole(){
        Role role = new Role();
        role.setRoleName("测试返回值");
        role.setRoleContent("这一条用来测试返回值");
        int id = roleService.addRole(role);
        System.out.println(id);
        System.out.println(role.getRoleId());
    }

    @Test
    public void findAllRole(){
        List<Role> roles = roleService.findAllRole();
        for (Role role : roles) {
            System.out.println(role);
        }
    }
}
