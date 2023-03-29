package com.example.lab.Service;

import com.example.lab.Dao.UserDao;
import com.example.lab.Entity.User;
import com.example.lab.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void update(User user){
        dao.update(user);
    }
    public void delete(String id){
        dao.delete(id);
    }

    public User login(String userName, String userPassword){
        User user  = dao.login(userName, userPassword);
        return user;
    }
}
