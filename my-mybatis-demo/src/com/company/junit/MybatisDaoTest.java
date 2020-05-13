package com.company.junit;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.example.mapper.UserMapper;
import org.mybatis.example.pojo.Orders;
import org.mybatis.example.pojo.QueryVo;
import org.mybatis.example.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDaoTest {

    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void select() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserById(1);
        System.out.println("1");
    }

    /*一对一*/
    @Test
    public void getOrder() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<Orders> list = mapper.findOrders();
        System.out.println("1");
    }

    /*查询 一对多 以用户为中心*/
    @Test
    public void getUsersWithOrders() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> list = mapper.findUserWithOrders();
        System.out.println("1");
    }

    /*新增*/
    @Test
    public void insert() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("123");
        mapper.inserUser(user);
        session.commit();
    }

    /*修改*/
    @Test
    public void update() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("abc");
        user.setId(28);
        mapper.updataUserById(user);
        session.commit();
    }

}
