package com.example.lab.Dao;

import com.example.lab.Entity.Equipment;
import com.example.lab.Mapper.BreakdownMapper;
import com.example.lab.Mapper.EquipmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class EquipmentDao {
    @Autowired
    private EquipmentMapper equipmentMapper;

    public void add(Equipment equipment) {
        equipmentMapper.add(equipment);
    }

    public List<Equipment> get() {
        return equipmentMapper.get();
    }

    public void update(Equipment equipment) {
        equipmentMapper.update(equipment);
    }
}
