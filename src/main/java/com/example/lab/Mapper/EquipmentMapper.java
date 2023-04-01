package com.example.lab.Mapper;

import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Entity.Equipment;
import com.example.lab.Entity.User;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface EquipmentMapper {
    void add(Equipment equipment);
    List<Equipment> get();
    void update(Equipment equipment);
    List<Equipment> getById(@Param("id") String id);

    Equipment getByName(@Param("equipmentName") String equipmentName);

}
