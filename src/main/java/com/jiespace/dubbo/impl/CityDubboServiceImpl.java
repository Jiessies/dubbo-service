package com.jiespace.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jiespace.domain.City;
import com.jiespace.dubbo.CityDubboService;

/**
 * Created by huangmingjie on 2017/10/12.
 */
@Service(group = "cityService",version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {
        
        return new City(1L,2L,cityName,"是我的故乡!!!!!!!");
    }
}
