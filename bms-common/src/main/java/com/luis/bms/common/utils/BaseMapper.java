package com.luis.bms.common.utils;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

public interface BaseMapper<T> extends Mapper<T>,InsertListMapper<T>{

}
