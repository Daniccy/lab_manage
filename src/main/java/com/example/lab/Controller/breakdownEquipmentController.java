package com.example.lab.Controller;

import com.example.lab.Entity.Breakdown;
import com.example.lab.Service.BreakdownEquipmentService;
import com.example.lab.common.Ret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("breakdownEquipmentController")

public class breakdownEquipmentController {
    @Autowired
    private BreakdownEquipmentService service;
    // 增加损坏设备
    public Ret add(Breakdown breakdown){
        service.add(breakdown);
        return new Ret("success", null);
    }
    // 获取损坏设备
    public Ret get(){
        return new Ret("success", service.get());
    }
}
