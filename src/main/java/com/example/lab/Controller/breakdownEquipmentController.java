package com.example.lab.Controller;

import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.Equipment;
import com.example.lab.Service.BasicEquipmentService;
import com.example.lab.Service.BreakdownEquipmentService;
import com.example.lab.Util.RetUtil;
import com.example.lab.common.Ret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Objects;

@Controller("breakdownEquipmentController")

public class breakdownEquipmentController {
    @Autowired
    private BreakdownEquipmentService service;
    @Autowired
    private BasicEquipmentService basicEquipmentService;
    // 增加损坏设备
    public Ret<?> add(Breakdown breakdown){
        if(breakdown.getEquipmentName() == null){
            return RetUtil.failure("设备名称不允许为空");
        }
        if(breakdown.getApplyPerson() == null){
            return RetUtil.failure("申请人不能为空");
        }
        Equipment equipment = basicEquipmentService.getById(breakdown.getEquipmentId());
        if(Objects.isNull(equipment)){
            return RetUtil.failure("设备不存在");
        }
        service.add(breakdown);
        return RetUtil.successWithMsg("添加成功");
    }
    // 获取损坏设备
    public Ret<?> get(){
        return RetUtil.success(service.get());
    }
}
