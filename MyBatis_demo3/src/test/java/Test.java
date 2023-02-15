import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test {

    @org.junit.Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByCondition = mapper.getEmpByCondition(new Emp(null, "张三", 22, "男", "2423"));
        System.out.println(empByCondition);

    }
}
