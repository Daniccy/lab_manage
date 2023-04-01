package com.example.lab.Dao;

import com.example.lab.Entity.Feedback;
import com.example.lab.Entity.Repair;
import com.example.lab.Mapper.BreakdownMapper;
import com.example.lab.Mapper.RepairMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class RepairDao {
    @Autowired
    private RepairMapper repairMapper;

    public void add(Repair repair) {
        repairMapper.add(repair);
    }

    public List<Repair> get() {
        return repairMapper.get();
    }

    public List<Repair> getById(String id){
        return repairMapper.getById(id);
    }

    public void update(Repair repair){
        repairMapper.update(repair);
    }
}
