package com.example.lab.Controller;

import com.example.lab.Dao.UserDao;
import com.example.lab.Entity.User;
import com.example.lab.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("UserController")

public class UserController {
    @Autowired
    private UserService service;

    // 添加用户
    public void add(User user){
        service.add(user);
    }

    // 获取用户信息
    public User get(String id){
        return service.get(id);
    }

    // 更新用户信息
    public void update(User user){
        service.update(user);
    }

    // 删除用户信息
    public void delete(String id){
        service.delete(id);
    }
}
