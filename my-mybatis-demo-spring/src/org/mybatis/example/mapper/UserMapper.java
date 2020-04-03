package org.mybatis.example.mapper;

import org.mybatis.example.pojo.Orders;
import org.mybatis.example.pojo.QueryVo;
import org.mybatis.example.pojo.User;

import java.util.List;

public interface UserMapper {
    public User findUserById (Integer id );
    public User selectUserById(Integer id );
    public List<User> findUserByUsername (String name );
    public List<User> findUserByQueryVo (QueryVo vo);
    public List<User> findUserByWhere (User user);
    public List<User> findUserByQueryVo2 (QueryVo vo);
    public void inserUser (User user);
    public void updataUserById (User user);
    public List<Orders> findOrders();
    public List<User> findUserWithOrders();
}
