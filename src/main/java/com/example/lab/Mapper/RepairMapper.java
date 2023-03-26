package com.example.lab.Mapper;

import com.example.lab.Entity.Repair;
import com.example.lab.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository

public interface RepairMapper {
    void add(Repair repair);
    Repair get(int id);
}
