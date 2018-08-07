package com.jiespace.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.codingapi.tx.annotation.TxTransaction;
import com.jiespace.domain.City;
import com.jiespace.domain.TestOrder;
import com.jiespace.dubbo.CityDubboService;
import com.jiespace.mapper.CityDubboMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by huangmingjie on 2017/10/12.
 */
@Service(group = "cityService",version = "1.0.1", interfaceClass = CityDubboService.class)
public class CityDubboServiceImpl implements CityDubboService {

    @Autowired
    private CityDubboMapper cityDubboMapper;

    @TxTransaction
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public City findCityByName(String cityName) {
        TestOrder order = new TestOrder();
        order.setOrderNo(String.valueOf(System.currentTimeMillis()) + cityName);
        order.setCreatetime(new Date());
        order.setOrderstatus(1);
        order.setOrderprice(100);
        cityDubboMapper.insertOrder(order);
        return new City(1L,2L,cityName,"是我的故乡!!!!!!!");
    }
}
