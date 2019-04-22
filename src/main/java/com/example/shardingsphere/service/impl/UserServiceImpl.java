package com.example.shardingsphere.service.impl;

import com.example.shardingsphere.dao.UserDao;
import com.example.shardingsphere.entity.User;
import com.example.shardingsphere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/29 14:29
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public boolean add(User user) {
        return userDao.add(user);
    }

    @Override
    public boolean delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user);
    }

    @Override
    public User query(Integer id) {
        return userDao.query(id);
    }
}
