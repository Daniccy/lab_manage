package com.example.lab.Mapper;

import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository

public interface BreakdownMapper {
    void add(Breakdown breakdown);
    Breakdown get(int id);
}
