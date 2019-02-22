package com.drafire.spring_boot.mybatis;

import com.drafire.spring_boot.dao.UserDao;
import com.drafire.spring_boot.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserSqlsessionTest {

    private UserDao userDao;

    @Test
    public void test1() throws Exception {
        InputStream inputStream= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(inputStream);

        //是否自动提交
        SqlSession session=factory.openSession(true);
        this.userDao=session.getMapper(UserDao.class);

        User user = userDao.getUser(1);
    }
}
