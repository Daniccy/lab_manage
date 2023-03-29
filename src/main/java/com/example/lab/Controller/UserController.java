package com.example.lab.Controller;

import com.example.lab.Dao.UserDao;
import com.example.lab.Entity.EntityCache;
import com.example.lab.Entity.User;
import com.example.lab.Service.UserService;
import com.example.lab.Util.CacheManagerUtil;
import com.example.lab.Util.RetUtil;
import com.example.lab.common.Ret;
import org.omg.CORBA.TIMEOUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.Timestamp;
import java.util.Objects;

@Controller("UserController")

public class UserController {
    @Autowired
    private UserService service;

    /* 过期时间 */
    public static final Long TIME_OUT = 24*60*60*1000L;

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

    /**
     * allWay 存储方式
     * @param userName
     * @param userPassward
     * @param allWay
     * @return
     */
   public Ret<?> login(String userName, String userPassward, int allWay){
        User user = service.login(userName, userPassward);
        if(Objects.isNull(user)){
            return RetUtil.successWithMsg("用户名或密码错误");
        }
        CacheManagerUtil.putCache(user.getUserId(), user, TIME_OUT);
        return RetUtil.successWithMsg("登录成功");
   }
}
