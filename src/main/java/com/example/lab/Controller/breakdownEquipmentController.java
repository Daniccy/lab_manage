package com.example.lab.Controller;

import com.example.lab.Entity.Breakdown;
import com.example.lab.Service.BreakdownEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class breakdownEquipmentController {
    @Autowired
    private BreakdownEquipmentService service;
    // 增加损坏设备
    public void add(Breakdown breakdown){
        service.add(breakdown);
    }
    // 获取损坏设备
    public Breakdown get(Integer id){
        return service.get(id);
    }
}
