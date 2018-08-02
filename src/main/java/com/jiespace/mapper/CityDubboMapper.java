package com.jiespace.mapper;

import com.jiespace.domain.TestOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityDubboMapper {
    int insertOrder(TestOrder order);
}
