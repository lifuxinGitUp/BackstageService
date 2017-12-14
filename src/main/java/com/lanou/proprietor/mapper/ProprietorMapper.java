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

    // 停用
    int stopProprietor(Integer id);

    // 启用
    int startProprietor(Integer id);

    //将用户删除,但是不会删除数据库,会改变deleteState的状态
    int deleteProprietor(Proprietor proprietor);

    // 查询已经删除的业主信息
    List<Proprietor> findAllDeleteProprirtor();

    // 撤销删除
    int revokeDelete(Integer id);

    // 彻底删除业主
    int delProprietor(Integer id);

    // 高级查询
    List<Proprietor> findByGJ(String str);




}
