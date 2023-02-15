package com.atguigu.mybatis;


import com.atguigu.mybatis.mapper.SQLMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.jnlp.ClipboardService;
import java.util.List;

public class SQLMapperTest {
    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "hhh", "123456", 25, "男", "123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);


    }
}
