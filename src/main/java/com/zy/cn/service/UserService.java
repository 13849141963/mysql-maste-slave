package com.zy.cn.service;

import com.zy.cn.entity.User;

import java.util.List;

public interface UserService {

    void insert(User user);

    List<User> queryAll();
}
