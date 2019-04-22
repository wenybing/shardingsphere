package com.example.shardingsphere.dao;

import com.example.shardingsphere.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/29 14:17
 */
@Mapper
public interface UserDao {
    public List<User> queryAll();

    public boolean add(User user);

    public boolean delete(Integer id);

    public boolean update(User user);

    public User query(Integer id);
}
