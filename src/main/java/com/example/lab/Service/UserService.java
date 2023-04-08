package com.example.lab.Service;

import com.example.lab.Dao.UserDao;
import com.example.lab.Entity.User;
import com.example.lab.Mapper.UserMapper;
import com.example.lab.Util.CacheManagerUtil;
import com.example.lab.Util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import static com.example.lab.Controller.UserController.TIME_OUT;

@Service

public class UserService {
    @Autowired
    private UserDao dao;
    public void add(User user){
        dao.add(user);
    }
    public User get(String id){
        return dao.get(id);
    }
    public void update(User user, String token){
        if(user.getUserId() == null){
            String userId = TokenUtil.getInfoByToken(token);
            user.setUserId(userId);
        }
        dao.update(user);
    }
    public void delete(String id){
        dao.delete(id);
    }

    /**
     * 0 表示管理员 1 表示用户 -1 表示用户不存在
     * @param userName
     * @param userPassword
     * @return
     */
    public Map<String, Object> login(String userName, String userPassword){
        User user  = dao.login(userName, userPassword);
        if(Objects.isNull(user)) return null;
        String token = TokenUtil.generateToken(user);
        CacheManagerUtil.putCache(token, user, TIME_OUT);
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("token", token);

        if(user.getUserId().startsWith("99")) {
            map.put("auth", 0);
            return map;
        };
        map.put("auth", 1);
        return map;
    }

    public List<User> selectAll(){
        return dao.selectAll();
    }
}
