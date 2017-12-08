package com.lanou.proprietor.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.proprietor.bean.Proprietor;
import com.lanou.proprietor.service.ProprietorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dllo on 17/12/6.
 */
@Controller
@RequestMapping("proprietor")
public class ProprietorController {

    @Resource
    private ProprietorService proprietorService;

    @RequestMapping(value = "/addProprietor")
    public String addProprietor(Proprietor proprietor){
//        System.out.println("6666666666666");
        Date date = new Date();
        long time = date.getTime();
        Timestamp timestamp = new Timestamp(time);
        proprietor.setCreateTime(timestamp);
        proprietor.setState(1);
        proprietorService.addProprietor(proprietor);
        return "proprietor/proprietor-add";
    }

    // 查询所有业主信息
    @ResponseBody
    @RequestMapping(value = "findAllProprietor")
    public PageInfo<Proprietor> findAllProprietor(Integer pageNum,Integer pageSize){
        PageInfo<Proprietor> proprietorPageInfo = proprietorService.findAllProprietor(pageNum,pageSize);
        System.out.println("7777" + proprietorPageInfo);
        return proprietorPageInfo;
    }

    //  (回显),目的修改业主的信息
    @RequestMapping(value = "findProprietorById")
    public String findProprietorById(@RequestParam("id")Integer id,
                                     HttpSession session){
        Proprietor proprietor = proprietorService.findProprietorById(id);
        session.setAttribute("proprietor",proprietor);
        session.setAttribute("id",id);
        return "proprietor/proprietor-edit";
    }

    // 数据回显
    @RequestMapping(value = "/show")
    @ResponseBody
    public Map<String,Object> show(HttpSession session){
        Proprietor proprietor = (Proprietor) session.getAttribute("proprietor");
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("showProprietor",proprietor);
        return map;
    }

    // 修改业主信息
    @RequestMapping(value = "/updateProprietor")
    public String upateProprietor(String proName,String gender,
                                  String telephone, String address, String remark,HttpSession session){
        int id = (int) session.getAttribute("id");
        Proprietor proprietor = proprietorService.findProprietorById(id);
        proprietor.setProName(proName);
        proprietor.setGender(gender);
        proprietor.setTelephone(telephone);
        proprietor.setAddress(address);
        proprietor.setRemark(remark);
        proprietorService.updateProprietor(proprietor);
        return "proprietor/proprietor-list";

    }






}
