package com.example.lab.Service;

import com.example.lab.Dao.RepairDao;
import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.Repair;
import com.example.lab.Mapper.RepairMapper;
import com.example.lab.Util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RepairProcessService {
    @Autowired
    private RepairDao repairDao;

    public List<Repair> get() {
        return repairDao.get();
    }

    public void add(Repair repair, String token) {
        if(repair.getRepairPerson() != null){
            repair.setRepairPerson(TokenUtil.getInfoByToken(token));
        }
        repairDao.add(repair);
    }

    public Repair getById(int id){
        return repairDao.getById(id);
    }

    public void update(Repair repair){
        repairDao.update(repair);
    }

}
