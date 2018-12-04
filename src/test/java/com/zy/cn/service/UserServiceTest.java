package com.zy.cn.service;

import com.zy.cn.dao.UserDAO;
import com.zy.cn.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class UserServiceTest {


    @Resource
    UserService userService;
    /***
     *
     */
    @Test
    public void cencelTaskInst(){
        //userService.insert(new User(4,"千钧一发",89,new Date()));
        List<User> users = userService.queryAll();
    }

}
