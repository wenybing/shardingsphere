package com.example.shardingsphere.service;

import com.example.shardingsphere.entity.User;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 23:12
 */
public interface UserService {
    public List<User> queryAll();

    public boolean add(User user);

    public boolean delete(Integer id);

    public boolean update(User user);

    public User query(Integer id);
}
