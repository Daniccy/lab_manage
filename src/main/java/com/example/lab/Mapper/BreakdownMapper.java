package com.example.lab.Mapper;

import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface BreakdownMapper {
    void add(Breakdown breakdown);
    List<Breakdown> get();
}
