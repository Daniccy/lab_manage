package com.example.lab.Mapper;

import com.example.lab.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface UserMapper {
    void add(User user);
    User get(String id);
    void update(User user);
    void delete(String id);

    User login(@Param("userName") String userName, @Param("userPassword") String userPassword);

    List<User> selectAll();
}
