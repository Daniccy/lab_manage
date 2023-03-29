package com.example.lab.Dao;

import com.example.lab.Entity.User;
import com.example.lab.Mapper.UserMapper;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class UserDao {
    @Autowired
    private UserMapper mapper;
    public void add(User user){
        mapper.add(user);
    }
    public User get(String id){
        return mapper.get(id);
    }
    public void update(User user){
        mapper.update(user);
    }
    public void delete(String id){
        mapper.delete(id);
    }

    public User login(String userName, String userPassword){
        mapper.login(userName, userPassword);
    }
}
