package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    List<User> getUserById(@Param("id") Integer id);

    Integer getCount();

    Map<String , Object> getUserByIdToMap(@Param("id") Integer id);

    List<Map<String , Object>> getAllUserToMap();

}
