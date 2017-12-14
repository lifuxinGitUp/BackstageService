package com.lanou.proprietor.mapper;

import com.lanou.proprietor.bean.Customer;

import java.util.List;

/**
 * Created by dllo on 17/12/13.
 */
public interface CustomerMapper {

    // 查询所有每个车库的客户
    List<Customer> findAllCustomer(Integer id);

    // 插入客户的出租记录
    void addCustomer(Customer customer);


}
