package com.example.shardingsphere.entity;

import lombok.Data;

/**
 * @Author wenyabing
 * @Date 2019/3/29 14:15
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String city;
    private String dbSource;
}
