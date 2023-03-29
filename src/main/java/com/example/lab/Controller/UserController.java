package com.example.lab.Controller;

import com.example.lab.Dao.UserDao;
import com.example.lab.Entity.User;
import com.example.lab.Service.UserService;
import com.example.lab.Util.RetUtil;
import com.example.lab.common.Ret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("UserController")

public class UserController {
    @Autowired
    private UserService service;

    // 添加用户
    public Ret<?> add(User user){
        service.add(user);
        return RetUtil.successWithMsg("添加用户成功");
    }

    // 获取用户信息
    public Ret<?> get(String id){
        return RetUtil.success(service.get(id));
    }

    // 更新用户信息
    public Ret<?> update(User user){
        service.update(user);
        return RetUtil.successWithMsg("更新成功");
    }

    // 删除用户信息
    public Ret<?> delete(String id){
        service.delete(id);
        return RetUtil.successWithMsg("删除用户成功");
    }
}
