package com.example.hello.controller;

/**
 * Created by Administrator on 2016/12/8.
 */
import com.example.hello.dao.UserDao;
import com.example.hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.hello.dao.*;

import java.util.ArrayList;

@Controller
public class UserController {
    @Autowired
    public UserDao userDao;
    @RequestMapping("/getbyname")
    @ResponseBody
    public String getByName(String name) {
        String userId;
        User user = userDao.findByName(name);
        if (user != null) {
            userId = String.valueOf(user.getId());
            return "The user id is: " + userId;
        }
        return "user " + name + " is not exist.";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        User user = new User();
        user.setName("张三");
        User user2 = userDao.save(user);
        if (user != null) {
            return "The user id is: " + user2.getId();
        }
        return "user id is not exist.";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update() {
        User user = new User();
        user.setId(1);
        user.setName("李四");
        User user2 = userDao.save(user);
        if (user != null) {
            return "The user id is: " + user2.getId();
        }
        return "user id is not exist.";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        User user = new User();
        user.setId(2);
        userDao.delete(user);
        return "执行了删除操作";
    }

    @RequestMapping("/getall")
    @ResponseBody
    public String get(){
        ArrayList<User> arrayList=new ArrayList<User>();
        String str= "";
        arrayList = userDao.findAll();
        for (User user:arrayList) {
            str+=user.getName()+"<br>";
        }
        return str;
    }
}