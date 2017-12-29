package com.jiespace.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jiespace.domain.City;
import com.jiespace.dubbo.CityDubboService;

/**
 * Created by huangmingjie on 2017/10/12.
 */
@Service(group="helloService", version="1.0")
public class HelloServiceImpl implements CityDubboService {
    @Override
    public City findCityByName(String cityName) {
        return new City(100L,200L,cityName,"这个城市不咋地！");
    }
}
