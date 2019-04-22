package com.example.shardingsphere.controller;

import com.example.shardingsphere.entity.User;
import com.example.shardingsphere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/29 14:32
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/queryAll")
    public List<User> queryAll() {
        return userService.queryAll();
    }

    @GetMapping("/query/{id}")
    public User query(@PathVariable("id") Integer id) {
        return userService.query(id);
    }

    @PostMapping("/add")
    public boolean add(User user) {
        return userService.add(user);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return userService.delete(id);
    }

    @PutMapping("/update")
    public boolean update(User user) {
        return userService.update(user);
    }
}
