package com.lanou.proprietor.test;


import com.github.pagehelper.PageInfo;
import com.lanou.proprietor.bean.CarSpace;
import com.lanou.proprietor.bean.Customer;
import com.lanou.proprietor.bean.Proprietor;
import com.lanou.proprietor.mapper.ProprietorMapper;
import com.lanou.proprietor.service.CarSpaceService;
import com.lanou.proprietor.service.CustomerService;
import com.lanou.proprietor.service.ProprietorService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dllo on 17/12/6.
 */
public class ProprietorTest {

    private ApplicationContext context;
    private ProprietorService proprietorService;
    private ProprietorMapper proprietorMapper;
    private CarSpaceService carSpaceService;
    private CustomerService customerService;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("SSM-*.xml");
        proprietorService = (ProprietorService) context.getBean("proprietorService");
        proprietorMapper = (ProprietorMapper) context.getBean("proprietorMapper");

        carSpaceService = (CarSpaceService) context.getBean("carSpaceService");
        customerService = (CustomerService) context.getBean("customerService");
    }

    @Test
    public void test1() {
        Proprietor proprietor = new Proprietor();
        proprietor.setProName("张三");
        proprietor.setGender("男");
        proprietor.setTelephone("15724516172");
        proprietor.setCarMessage("宝马");
        proprietor.setRemark("爱咋咋的");
        proprietor.setAddress("asdasd");
        proprietorService.addProprietor(proprietor);

    }

    @Test
    public void test2() {
//        proprietorService.findAllProprietor(1,3);
//        proprietorService.stopProprietor(24);
//        proprietorService.startProprietor(24);
//        proprietorService.findAllDeleteProprirtor(1, 3);
//        List<Proprietor> ad = proprietorService.findByGJ("11");
//        for (Proprietor proprietor : ad) {
//            System.out.println(proprietor);
//        }
//        carSpaceService.findAllCustomer(1, 1, 1);
//        List<CarSpace> carSpaces = carSpaceService.findAllCustomer(1);
//        System.out.println(carSpaces.get(0).getCustomerList());
//        customerService.findAllCustomer(1, 3);

    }


}






