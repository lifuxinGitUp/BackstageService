package com.lanou.proprietor.service;

import com.github.pagehelper.PageInfo;
import com.lanou.proprietor.bean.Proprietor;

import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
public interface ProprietorService {

    // 插入业主信息
    void addProprietor(Proprietor proprietor);

    // html拼接, 查询分页查询所有
    PageInfo<Proprietor> findAllProprietor(Integer pageNum, Integer pageSize);

    // 表单回显,根据id查询业主对象
    Proprietor findProprietorById(Integer id);

    // 修改业主信息
    int updateProprietor(Proprietor proprietor);

}
