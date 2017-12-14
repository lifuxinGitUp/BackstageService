package com.lanou.proprietor.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.proprietor.bean.CarSpace;
import com.lanou.proprietor.bean.Proprietor;
import com.lanou.proprietor.mapper.ProprietorMapper;
import com.lanou.proprietor.service.ProprietorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
@Service("proprietorService")
public class ProprietorServiceImpl implements ProprietorService {

    @Resource
    private ProprietorMapper proprietorMapper;

    // 插入业主信息
    @Override
    public void addProprietor(Proprietor proprietor) {

        proprietorMapper.addProprietor(proprietor);
    }

    // 查询所有业主的信息
    @Override
    public PageInfo<Proprietor> findAllProprietor(Integer pageNum, Integer pageSize) {
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 3 : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<Proprietor> allProprietor = proprietorMapper.findAllProprietor();
        PageInfo<Proprietor> proprietorPageInfo = new PageInfo<Proprietor>(allProprietor);
//        System.out.println(proprietorPageInfo);
        return proprietorPageInfo;
    }

    // 表单回显
    @Override
    public Proprietor findProprietorById(Integer id) {
        return proprietorMapper.findProprietorById(id);
    }

    // 修改业主信息
    @Override
    public int updateProprietor(Proprietor proprietor) {
        return proprietorMapper.updateProprietor(proprietor);
    }

    // 停用
    @Override
    public int stopProprietor(Integer id) {
        return proprietorMapper.stopProprietor(id);
    }

    // 启用
    @Override
    public int startProprietor(Integer id) {
        return proprietorMapper.startProprietor(id);
    }

    // 删除业主,修改表里的deleteState为0
    @Override
    public int deleteProprietor(Proprietor proprietor) {
        return proprietorMapper.deleteProprietor(proprietor);
    }

    // 查询所有删除的业主
    @Override
    public PageInfo<Proprietor> findAllDeleteProprirtor(Integer pageNum, Integer pageSize) {
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 3 : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<Proprietor> allDeleteProprirtor = proprietorMapper.findAllDeleteProprirtor();
        PageInfo<Proprietor> allDeleteInfo = new PageInfo<Proprietor>(allDeleteProprirtor);
        System.out.println(allDeleteInfo);
        return allDeleteInfo;
    }

    //  撤销删除
    @Override
    public int revokeDelete(Integer id) {
        return proprietorMapper.revokeDelete(id);
    }

    // 彻底删除业主
    @Override
    public int delProprietor(Integer id) {
        return proprietorMapper.delProprietor(id);
    }

    // 高级查询
    @Override
    public List<Proprietor> findByGJ(String str) {
        return proprietorMapper.findByGJ(str);
    }




}
