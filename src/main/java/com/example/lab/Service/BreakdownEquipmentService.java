package com.example.lab.Service;

import com.example.lab.Dao.BreakdownDao;
import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.Equipment;
import com.example.lab.Util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreakdownEquipmentService {
    @Autowired
    private BreakdownDao breakdownDao;
    // 增加损坏设备
    public void add(Breakdown breakdown, String token){
        if(breakdown.getApplyPerson() == null){
            breakdown.setApplyPerson(TokenUtil.getInfoByToken(token));
        }
        breakdownDao.add(breakdown);
    }
    // 获取损坏设备
    public List<Breakdown> get(){
        return breakdownDao.get();
    }

    public Breakdown getById(int id){
        return breakdownDao.getById(id);
    }

    public void update(Breakdown breakdown, String token){
        if(breakdown.getApplyPerson() == null){
            breakdown.setApplyPerson(TokenUtil.getInfoByToken(token));
        }
        breakdownDao.update(breakdown);
    }
}
