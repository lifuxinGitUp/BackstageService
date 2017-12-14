package com.lanou.proprietor.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.proprietor.bean.Customer;
import com.lanou.proprietor.bean.Proprietor;
import com.lanou.proprietor.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by dllo on 17/12/14.
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    // 跳转到添加页面
    @RequestMapping(value = "customerAdd")
    public String customer_add() {
        return "/proprietor/customer-add";
    }

    // 查询所有一号车库的顾客
    @ResponseBody
    @RequestMapping(value = "/findAllCustomer")
    public PageInfo<Customer> findAllCustomer(Integer pageNum, Integer pageSize, HttpServletRequest request) {
        int id = (int) request.getServletContext().getAttribute("id");
        PageInfo<Customer> allCustomer = customerService.findAllCustomer(pageNum, pageSize, id);
        System.out.println(allCustomer);
        return allCustomer;
    }

    // 添加出租顾客的信息
    @RequestMapping(value = "/addCustomer")
    public String addCustomer(Customer customer, HttpServletRequest request) {
        int id = (int) request.getServletContext().getAttribute("id");
        Date date = new Date();
        long time = date.getTime();
        Timestamp timestamp = new Timestamp(time);
        customer.setStartTime(timestamp);
        customer.setId(id);
        customerService.addCustomer(customer);
        return "/proprietor/numberOneGarage";

    }


}
