package com.example.lab.Mapper;

import com.example.lab.Entity.Repair;
import com.example.lab.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface RepairMapper {
    void add(Repair repair);
    List<Repair> get();
}
