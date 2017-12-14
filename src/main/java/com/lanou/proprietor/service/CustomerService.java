package com.lanou.proprietor.service;

import com.github.pagehelper.PageInfo;
import com.lanou.proprietor.bean.Customer;

/**
 * Created by dllo on 17/12/14.
 */
public interface CustomerService {

    // 查询所有每个车库的客户,分页
    PageInfo<Customer> findAllCustomer(Integer pageNum, Integer pageSize,Integer id);

    // 插入客户的出租记录
    void addCustomer(Customer customer);


}
