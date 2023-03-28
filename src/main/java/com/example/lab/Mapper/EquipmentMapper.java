package com.example.lab.Mapper;

import com.example.lab.Entity.Equipment;
import com.example.lab.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface EquipmentMapper {
    void add(Equipment equipment);
    List<Equipment> get();
    void update(Equipment equipment);
}
