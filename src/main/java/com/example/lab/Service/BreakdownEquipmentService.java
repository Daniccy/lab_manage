package com.example.lab.Service;

import com.example.lab.Dao.BreakdownDao;
import com.example.lab.Entity.Breakdown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreakdownEquipmentService {
    @Autowired
    private BreakdownDao breakdownDao;
    // 增加损坏设备
    public void add(Breakdown breakdown){
        breakdownDao.add(breakdown);
    }
    // 获取损坏设备
    public List<Breakdown> get(){
        return breakdownDao.get();
    }
}
