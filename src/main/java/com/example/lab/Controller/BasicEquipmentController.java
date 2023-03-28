package com.example.lab.Controller;

import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Entity.Equipment;
import com.example.lab.Service.BasicEquipmentService;
import com.example.lab.common.Ret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("BasicEquipmentController")
public class BasicEquipmentController {
    @Autowired
    private BasicEquipmentService service;

    // 增加设备
    public Ret addEquipment(Equipment equipment){
        service.addEquipment(equipment);
        return new Ret("success",null);
    }

    // 获取设备
    public Ret getEquipment(){
        return new Ret("success",service.getEquipment());
    }

    // 更新设备
    public Ret updateEquipment(Equipment equipment){
        service.updateEquipment(equipment);
        return new Ret("success",null);
    }


    // 借设备
    public Ret insertBorrow(BorrowReturn borrowReturn) {
        service.insertBorrow(borrowReturn);
        return new Ret("success", null);
    }

    // 还设备
    public Ret returnBorrow(BorrowReturn borrowReturn) {
        service.returnBorrow(borrowReturn);
        return new Ret("success", null);
    }


    // 获取设借出/归还备信息
    public Ret get() {
        return new Ret("success", service.get());
    }

    // 更新借出/归还设备信息
    public Ret update(BorrowReturn borrowReturn) {
        service.update(borrowReturn);
        return new Ret("success", null);
    }
}
