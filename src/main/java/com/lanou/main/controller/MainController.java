package com.lanou.main.controller;

import com.lanou.admin.bean.Admin;
import com.lanou.main.utils.AjaxResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dllo on 17/12/4.
 */
@Controller
public class MainController {

    @RequestMapping({"/", "index"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login")
    public String loginPage(HttpServletRequest request){
        if (SecurityUtils.getSubject().isAuthenticated()){
            return "index";
        }
        return "login";
    }

    public String login(Admin admin) {
        return null;
    }

    /**
     * 登录表单验证
     */
    @ResponseBody
    @RequestMapping(value = "/loginsubmit")
    public AjaxResult loginsubmit(HttpServletRequest request)  {
        // 如果在shirospring的配置文件中配置了表单认证过滤器
        // 那么这个方法中只需要处理异常信息即可
        // SecurityUtils.getSubject()
        AjaxResult ajaxResult = new AjaxResult();
        String exClassName = (String) request.getAttribute("shiroLoginFailure");
        if (UnknownAccountException.class.getName().equals(exClassName)){
            ajaxResult.setErrorCode(1);
            ajaxResult.setMessage("用户名不存在");
        }else if (IncorrectCredentialsException.class.getName().equals(exClassName)){
            ajaxResult.setErrorCode(1);
            ajaxResult.setMessage("密码错误");
        }
        return ajaxResult;
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
    @RequiresRoles("CEO")
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

    // 浏览记
    @RequestMapping(value = "proprietorCarCost")
    public String proprietor_Record_Browse(){
        return "proprietor/garageMessage";
    }





}
