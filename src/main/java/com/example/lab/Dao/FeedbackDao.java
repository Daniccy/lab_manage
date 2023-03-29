package com.example.lab.Dao;

import com.example.lab.Entity.Equipment;
import com.example.lab.Entity.Feedback;
import com.example.lab.Mapper.BreakdownMapper;
import com.example.lab.Mapper.FeedbackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class FeedbackDao {
    @Autowired
    private FeedbackMapper feedbackMapper;

    public List<Feedback> get() {
        return feedbackMapper.get();
    }

    public Feedback getById(int id){
        return feedbackMapper.getById(id);
    }
}
