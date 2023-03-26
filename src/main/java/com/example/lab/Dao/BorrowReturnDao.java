package com.example.lab.Dao;

import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Mapper.BorrowReturnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BorrowReturnDao {
    @Autowired
    private BorrowReturnMapper borrowReturnMapper;
    // 借设备
    public void insertBorrow(BorrowReturn borrowReturn) {
        borrowReturnMapper.insertBorrow(borrowReturn);
    }

    // 归还设备
    public void returnBorrow(BorrowReturn borrowReturn) {
        borrowReturnMapper.returnBorrow(borrowReturn);
    }

    public BorrowReturn get(int id) {
        return borrowReturnMapper.get(id);
    }

    public void update(BorrowReturn borrowReturn) {
        borrowReturnMapper.update(borrowReturn);
    }
}
