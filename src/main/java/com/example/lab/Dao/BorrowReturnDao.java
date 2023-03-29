package com.example.lab.Dao;

import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Mapper.BorrowReturnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public List<BorrowReturn> get() {
        return borrowReturnMapper.get();
    }

    public void update(BorrowReturn borrowReturn) {
        borrowReturnMapper.update(borrowReturn);
    }

    public BorrowReturn getById(int id){
        return borrowReturnMapper.getById(id);
    }
}
