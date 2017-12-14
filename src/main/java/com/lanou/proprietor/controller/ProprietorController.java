package com.lanou.proprietor.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.proprietor.bean.Proprietor;
import com.lanou.proprietor.service.ProprietorService;
import com.lanou.util.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
    public String addProprietor(Proprietor proprietor) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp timestamp = new Timestamp(time);
        proprietor.setCreateTime(timestamp);
        proprietor.setDeleteState(1);
        proprietor.setState(1);
        proprietorService.addProprietor(proprietor);
        return "proprietor/proprietor-list";
    }

    // 查询所有业主信息
    @ResponseBody
    @RequestMapping(value = "/findAllProprietor")
    public PageInfo<Proprietor> findAllProprietor(Integer pageNum, Integer pageSize) {
        PageInfo<Proprietor> proprietorPageInfo = proprietorService.findAllProprietor(pageNum, pageSize);
        System.out.println(proprietorPageInfo);
        return proprietorPageInfo;
    }

    // 查询所有已删除的业主,分页
    @RequestMapping(value = "/findAllDeleteProprietor")
    @ResponseBody
    public PageInfo<Proprietor> findAllDeleteProprietor(Integer pageNum, Integer pageSize) {
        PageInfo<Proprietor> proprietorPageInfo = proprietorService.findAllDeleteProprirtor(pageNum, pageSize);
        System.out.println(proprietorPageInfo);
        return proprietorPageInfo;
    }

    //  (回显),目的修改业主的信息
    @RequestMapping(value = "/findProprietorById")
    public String findProprietorById(@RequestParam("id") Integer id,
                                     HttpSession session) {
        Proprietor proprietor = proprietorService.findProprietorById(id);
        session.setAttribute("proprietor", proprietor);
        session.setAttribute("id", id);
        return "proprietor/proprietor-edit";
    }


    // 数据回显
    @RequestMapping(value = "/show")
    @ResponseBody
    public Map<String, Object> show(HttpSession session) {
        Proprietor proprietor = (Proprietor) session.getAttribute("proprietor");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("showProprietor", proprietor);
        return map;
    }


    // 修改业主信息
    @RequestMapping(value = "/updateProprietor")
    public String upateProprietor(String proName, String gender,
                                  String telephone, String address, String carMessage, String remark, HttpSession session) {
        int id = (int) session.getAttribute("id");
        Proprietor proprietor = proprietorService.findProprietorById(id);
        proprietor.setProName(proName);
        proprietor.setGender(gender);
        proprietor.setTelephone(telephone);
        proprietor.setAddress(address);
        proprietor.setCarMessage(carMessage);
        proprietor.setRemark(remark);
        proprietorService.updateProprietor(proprietor);
        return "proprietor/proprietor-list";

    }

    // 停用业主
    @RequestMapping(value = "/stopProprietor")
    public String stopProprietor(Integer id) {
        proprietorService.stopProprietor(id);
        return "proprietor/proprietor-list";
    }

    // 启用业主
    @RequestMapping(value = "/startProprietor")
    public String startProprietor(Integer id) {
        proprietorService.startProprietor(id);
        return "proprietor/proprietor-list";
    }

    // 删除业主,修改表中deleteState为0
    @RequestMapping(value = "/deleteProprietor")
    public String deleteProprietor(Integer id) {
        Proprietor proprietorById = proprietorService.findProprietorById(id);
        Date date = new Date();
        long time = date.getTime();
        Timestamp timestamp = new Timestamp(time);
        proprietorById.setOverTime(timestamp);
        proprietorService.deleteProprietor(proprietorById);
        return "proprietor/proprietor-list";
    }

    // 撤销删除
    @RequestMapping(value = "/revokeDelete")
    public String revokeDelete(Integer id) {
        proprietorService.revokeDelete(id);
        return "proprietor/proprietor-del";
    }

    // 彻底删除业主
    @RequestMapping(value = "/delProprietor")
    public String delProproetor(Integer id){
        proprietorService.delProprietor(id);
        return "proprietor/proprietor-del";
    }

    // 跳转到业主的详细信息
    @RequestMapping(value = "/showProprietor")
    public String showProprietor(){
        return "/proprietor/proprietor-show";
    }


    // 高级查询
    @RequestMapping(value = "/findByGJ")
    @ResponseBody
    public AjaxResult<Proprietor> findByGJ(String str){
        AjaxResult ajaxResult = new AjaxResult();
        List<Proprietor> byGJ = proprietorService.findByGJ(str);
        ajaxResult.setData(byGJ);
        System.out.println("byGJ"+byGJ);
        return ajaxResult;
    }

}
