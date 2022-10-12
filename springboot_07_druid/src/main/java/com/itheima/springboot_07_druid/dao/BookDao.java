package com.itheima.springboot_07_druid.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from t_dept where did= #{did}")
    int getById(Integer did);
}
