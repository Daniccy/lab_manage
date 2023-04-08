package com.example.lab.Mapper;

import com.example.lab.Entity.BorrowReturn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BorrowReturnMapper {
    // 借设备
    void insertBorrow(BorrowReturn borrowReturn);
    // 归还设备
    void returnBorrow(BorrowReturn borrowReturn);
    List<BorrowReturn> get();
    void update(BorrowReturn borrowReturn);
    BorrowReturn getById(@Param("id") Integer id);
    List<BorrowReturn> getByUserId(@Param("id") String id);
}
