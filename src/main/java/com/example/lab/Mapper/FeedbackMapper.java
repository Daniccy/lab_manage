package com.example.lab.Mapper;

import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Entity.Feedback;
import com.example.lab.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface FeedbackMapper {
    List<Feedback> get();

    Feedback getById(@Param("id") Integer id);

}
