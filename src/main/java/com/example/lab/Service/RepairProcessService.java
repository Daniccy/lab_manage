package com.example.lab.Service;

import com.example.lab.Dao.RepairDao;
import com.example.lab.Entity.Repair;
import com.example.lab.Mapper.RepairMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class RepairProcessService {
    @Autowired
    private RepairDao repairDao;

    public Repair get(Integer id) {
        return repairDao.get(id);
    }

    public void add(Repair repair) {
        repairDao.add(repair);
    }

}
