package com.example.lab.Mapper;

import com.example.lab.Entity.BorrowReturn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BorrowReturnMapper {
    // 借设备
    void insertBorrow(BorrowReturn borrowReturn);
    // 归还设备
    void returnBorrow(BorrowReturn borrowReturn);
    BorrowReturn get(int id);
    void update(BorrowReturn borrowReturn);
}
