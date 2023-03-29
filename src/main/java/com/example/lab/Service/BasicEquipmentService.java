package com.example.lab.Service;

import com.example.lab.Dao.BorrowReturnDao;
import com.example.lab.Dao.EquipmentDao;
import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Entity.Equipment;
import com.example.lab.common.Ret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicEquipmentService {
    @Autowired
    private EquipmentDao equipmentDao;
    @Autowired
    private BorrowReturnDao borrowReturnDao;

    // 增加设备
    public void addEquipment(Equipment equipment){
        equipmentDao.add(equipment);
    }

    // 获取设备
    public List<Equipment> getEquipment(){
        return equipmentDao.get();
    }

    // 更新设备
    public void updateEquipment(Equipment equipment){
        equipmentDao.update(equipment);

    }


    // 借设备
    public void insertBorrow(BorrowReturn borrowReturn) {
        borrowReturnDao.insertBorrow(borrowReturn);

    }

    // 还设备
    public void returnBorrow(BorrowReturn borrowReturn) {
        borrowReturnDao.returnBorrow(borrowReturn);

    }

    public List<BorrowReturn> get() {
        return borrowReturnDao.get();
    }

    public void update(BorrowReturn borrowReturn) {
        borrowReturnDao.update(borrowReturn);

    }

}
