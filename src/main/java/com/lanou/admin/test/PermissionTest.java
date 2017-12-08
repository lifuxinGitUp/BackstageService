package com.lanou.admin.test;

import com.lanou.admin.bean.Group;
import com.lanou.admin.bean.Permission;
import com.lanou.admin.service.PermissionService;
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
public class PermissionTest {
    private ApplicationContext context;
    @Qualifier("permissionService")
    @Autowired
    private PermissionService permissionService;

    @Before
    public void init(){
        /*启动spring容器*/
        context = new ClassPathXmlApplicationContext("SSM-*.xml");
        permissionService = context.getBean(PermissionService.class);
    }

    @Test
    public void findAllGroup(){
        List<Group> groups = permissionService.findAllGroup();
        for (Group group : groups) {
            System.out.println(group);
            for (Permission permission : group.getPermissions()) {
                System.out.println(permission);
            }
        }
    }

    @Test
    public void findAllPermission(){
        List<Permission> permissions = permissionService.findAllPermission();
        for (Permission permission : permissions) {
            System.out.println(permission);
        }
    }

    @Test
    public void addPermissionTest(){
        Group group = permissionService.findGroupById(2);
        Permission permission = new Permission("一号权限","测试添加用的一号权限");
        permission.setGroup(group);
        permissionService.addPermission(permission);
    }
}
