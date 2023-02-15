package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {

    //根据用户名模糊查询用户信息
    List<User> getUserByLike(@Param("username") String username);

    //批量删除
    int deleteMore(@Param("ids") String ids);

    List<User> getUserByTableName(@Param("tableName") String tableName);

    void insertUser(User user);
}
