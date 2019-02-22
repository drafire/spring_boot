package com.drafire.spring_boot.mybatis;

import com.drafire.spring_boot.dao.UserDao;
import com.drafire.spring_boot.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
 
    private static SqlSessionFactory sqlSessionFactory;
 
    public static SqlSession getSqlSession() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mappers/User.xml");
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); //build()方法会把inputStream关闭掉
            } else {
                inputStream.close();
            }
            return sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        SqlSession session = getSqlSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user = userDao.getUser(1);

    }
}
