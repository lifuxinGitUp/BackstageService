package com.lanou.proprietor.controller;

import com.lanou.proprietor.bean.CarSpace;
import com.lanou.proprietor.service.CarSpaceService;
import com.lanou.util.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by dllo on 17/12/12.
 */
@Controller
@RequestMapping("carspace")
public class CarSpaceController {

    @Resource
    private CarSpaceService carSpaceService;

    // 跳转到一号车库
    @RequestMapping(value = "/toNumberList")
    public String toNumberList(Integer id, HttpServletRequest request) {
        System.out.println(id);
//        session.getServletContext().setAttribute("id",id);
        request.getServletContext().setAttribute("id",id);
        return "/proprietor/numberOneGarage";
    }


    // 查询所有车库信息
    @RequestMapping(value = "/findAllCarSpace")
    @ResponseBody
    public AjaxResult<CarSpace> findAllCarSpace() {
        AjaxResult ajaxResult = new AjaxResult();
        List<CarSpace> carSpaceList = carSpaceService.findAllCarSpace();
        ajaxResult.setData(carSpaceList);
        return ajaxResult;
    }


}
