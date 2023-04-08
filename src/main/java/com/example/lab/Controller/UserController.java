package com.example.lab.Controller;

import com.example.lab.Entity.User;
import com.example.lab.Service.UserService;
import com.example.lab.Util.CacheManagerUtil;
import com.example.lab.Util.RetUtil;
import com.example.lab.Util.TokenUtil;
import com.example.lab.common.Ret;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller("UserController")

public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

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
    public Ret<?> get(String token){
        String id = TokenUtil.getInfoByToken(token);
        return RetUtil.success(service.get(id));
    }

    // 更新用户信息
    public Ret<?> update(User user, String token){
        service.update(user, token);
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
     * @return
     */
   public Ret<?> login(String userName, String userPassward){
        Map<String, Object> res = service.login(userName, userPassward);
        if(res == null){
            return RetUtil.successWithMsg("用户名或密码错误");
        }
        return RetUtil.success("登录成功", res);
   }

   public Ret<?> selectAll(){
       List<User> user = service.selectAll();
       if(user.size() == 0) return RetUtil.success("没有用户");
       return RetUtil.success(user);
   }
}
