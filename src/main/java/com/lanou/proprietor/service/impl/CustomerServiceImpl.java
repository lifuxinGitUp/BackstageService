package com.lanou.proprietor.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.proprietor.bean.Customer;
import com.lanou.proprietor.bean.Proprietor;
import com.lanou.proprietor.mapper.CustomerMapper;
import com.lanou.proprietor.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/12/14.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    // 查询某个车库中的所有客户
    @Override
    public PageInfo<Customer> findAllCustomer(Integer pageNum, Integer pageSize,Integer id) {
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 3 : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<Customer> allCustomer = customerMapper.findAllCustomer(id);
        PageInfo<Customer> customerPageInfo = new PageInfo<>(allCustomer);
        System.out.println(customerPageInfo);
        return customerPageInfo;
    }

    // 添加出租信息
    @Override
    public void addCustomer(Customer customer) {
        customerMapper.addCustomer(customer);
    }
}
