package com.lanou.proprietor.mapper;

import com.lanou.proprietor.bean.CarSpace;

import java.util.List;

/**
 * Created by dllo on 17/12/12.
 */
public interface CarSpaceMapper {

    // 查询所有车库
    List<CarSpace> findAllCarSpace();

    // 查询一号车库的所有顾客
//    CarSpace findAllCustomer(Integer id);



}
