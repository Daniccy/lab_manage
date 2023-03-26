package com.example.lab.Dao;

import com.example.lab.Entity.Repair;
import com.example.lab.Mapper.BreakdownMapper;
import com.example.lab.Mapper.RepairMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class RepairDao {
    @Autowired
    private RepairMapper repairMapper;

    public void add(Repair repair) {
        repairMapper.add(repair);
    }

    public Repair get(int id) {
        return repairMapper.get(id);
    }
}
