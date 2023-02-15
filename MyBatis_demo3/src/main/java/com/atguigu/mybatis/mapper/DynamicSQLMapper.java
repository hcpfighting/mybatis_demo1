package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {

    /**
     * 多条件查询
     */
    List<Emp> getEmpByCondition(Emp emp);

    int deleteMoreByArray(@Param("eids") Integer[] eids);

    int insertMoreByList(@Param("emps") List<Emp> emps);

}
