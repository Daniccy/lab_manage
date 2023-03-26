package com.example.lab.Mapper;

import com.example.lab.Entity.Feedback;
import com.example.lab.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository

public interface FeedbackMapper {
    Feedback get();
}
