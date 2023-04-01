package com.example.lab.Mapper;

import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface BreakdownMapper {
    void add(Breakdown breakdown);
    List<Breakdown> get();
    Breakdown getById(@Param("id") Integer id);
    void update(Breakdown breakdown);
    List<Breakdown> getByUserId(@Param("id") String id);
}
