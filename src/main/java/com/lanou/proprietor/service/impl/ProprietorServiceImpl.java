package com.lanou.proprietor.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
public class ProprietorServiceImpl implements ProprietorService{

    @Resource
    private ProprietorMapper proprietorMapper;

    // 插入业主信息
    @Override
    public void addProprietor(Proprietor proprietor) {

        proprietorMapper.addProprietor(proprietor);
    }

    // 查询所有业主的信息
    @Override
    public PageInfo<Proprietor> findAllProprietor(Integer pageNum,Integer pageSize) {
        pageNum = pageNum == null? 1:pageNum;
        pageSize = pageSize == null? 3:pageSize;
        PageHelper.startPage(pageNum,pageSize);
        List<Proprietor> allProprietor = proprietorMapper.findAllProprietor();
        PageInfo<Proprietor> proprietorPageInfo = new PageInfo<Proprietor>(allProprietor);
        System.out.println(proprietorPageInfo);
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


}
