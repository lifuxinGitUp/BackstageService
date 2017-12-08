package com.lanou.proprietor.mapper;

import com.lanou.proprietor.bean.Proprietor;

import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
public interface ProprietorMapper {

    // 插入业主信息
    void addProprietor(Proprietor proprietor);

    // 查询所有业主的信息
    List<Proprietor> findAllProprietor();

    // 表单回显,根据id查询业主对象
    Proprietor findProprietorById(Integer id);

    // 修改业主信息
    int updateProprietor(Proprietor proprietor);

}
