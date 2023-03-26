package com.example.lab.Dao;

import com.example.lab.Entity.Feedback;
import com.example.lab.Mapper.BreakdownMapper;
import com.example.lab.Mapper.FeedbackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class FeedbackDao {
    @Autowired
    private FeedbackMapper feedbackMapper;

    public Feedback get() {
        return feedbackMapper.get();
    }
}
