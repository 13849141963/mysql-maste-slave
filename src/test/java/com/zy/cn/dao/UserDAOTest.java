package com.zy.cn.dao;

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
public class UserDAOTest {


    @Resource
    UserDAO userDAO;
    /***
     *
     */
    @Test
    public void cencelTaskInst(){
        //userDAO.insert(new User(2,"千钧一发",89,new Date()));

        List<User> users = userDAO.queryAll();

        for (User user : users) {
            System.out.println(user.getName());
        }
    }

}
