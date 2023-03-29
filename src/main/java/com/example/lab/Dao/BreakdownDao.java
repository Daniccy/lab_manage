package com.example.lab.Dao;

import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Entity.Breakdown;
import com.example.lab.Mapper.BreakdownMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class BreakdownDao {
    @Autowired
    private BreakdownMapper breakdownMapper;
    public void add(Breakdown breakdown) {
        breakdownMapper.add(breakdown);
    }

    public List<Breakdown> get() {
        return breakdownMapper.get();
    }

    public Breakdown getById(int id){
        return breakdownMapper.getById(id);
    }
}
