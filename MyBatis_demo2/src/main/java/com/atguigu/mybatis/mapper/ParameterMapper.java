package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    /**
     * 根据用户名查询用户信息
     */
    User getUserByUsername(String username);

    /**
     * 查询所有的员工信息
     */
    List<User> getAllUser();

    /**
     * 验证用户名密码
     */
    User checkLogin(String username , String password);

    User checkLoginByMap(Map<String,Object> map);

    int insertUser(User user);

    User checkLoginByParam(@Param("username") String username, @Param("password") String password);


}
