package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.ParameterMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParameterTest {

    /**
     * MyBatis获取参数值的两种方式：${}和#{}
     * ${}本质字符串拼接
     *      可能出现sql注入
     *      需要手动加单引号
     * #{}本质占位符赋值（推荐）
     * MyBatis获取参数值的各种情况
     * 1、mapper接口方法的参数为单个字面量类型
     */

    @Test
    public void testGetAllUser() throws IOException {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> list = mapper.getAllUser();
        System.out.println(list);
    }
    @Test
    public void test1() throws IOException {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User admin = mapper.checkLoginByParam("admin", "123456");
        System.out.println(admin);


    }

}
