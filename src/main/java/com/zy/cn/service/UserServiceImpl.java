package com.zy.cn.service;

import com.zy.cn.annotation.Read;
import com.zy.cn.dao.UserDAO;
import com.zy.cn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void insert(User user) {

        userDAO.insert(user);
    }
    @Read
    @Override
    public List<User> queryAll() {
        return userDAO.queryAll();
    }
}
