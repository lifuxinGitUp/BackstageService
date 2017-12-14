package com.lanou.proprietor.service.impl;

import com.lanou.proprietor.bean.CarSpace;
import com.lanou.proprietor.mapper.CarSpaceMapper;

import com.lanou.proprietor.service.CarSpaceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/12/12.
 */
@Service("carSpaceService")
public class CarSpaceServiceImpl implements CarSpaceService {

    @Resource
    private CarSpaceMapper carSpaceMapper;
    // 查询车库信息
    @Override
    public List<CarSpace> findAllCarSpace() {
        return carSpaceMapper.findAllCarSpace();
    }
}
