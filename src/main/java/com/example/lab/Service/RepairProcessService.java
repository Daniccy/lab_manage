package com.example.lab.Service;

import com.example.lab.Dao.RepairDao;
import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.Repair;
import com.example.lab.Mapper.RepairMapper;
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

    public void add(Repair repair) {
        repairDao.add(repair);
    }

    public Repair getById(int id){
        return repairDao.getById(id);
    }

}
