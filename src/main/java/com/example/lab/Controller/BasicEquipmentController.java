package com.example.lab.Controller;

import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Entity.Equipment;
import com.example.lab.Service.BasicEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BasicEquipmentController {
    @Autowired
    private BasicEquipmentService service;

    // 增加设备
    public void addEquipment(Equipment equipment){
        service.addEquipment(equipment);
    }

    // 获取设备
    public List<Equipment> getEquipment(){
        return service.getEquipment();
    }

    // 更新设备
    public void updateEquipment(Equipment equipment){
        service.updateEquipment(equipment);
    }


    // 借设备
    public void insertBorrow(BorrowReturn borrowReturn) {
        service.insertBorrow(borrowReturn);
    }

    // 还设备
    public void returnBorrow(BorrowReturn borrowReturn) {
        service.returnBorrow(borrowReturn);
    }

    public BorrowReturn get(int id) {
        return service.get(id);
    }

    public void update(BorrowReturn borrowReturn) {
        service.update(borrowReturn);
    }
}
