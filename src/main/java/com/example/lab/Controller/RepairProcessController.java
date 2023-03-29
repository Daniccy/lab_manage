package com.example.lab.Controller;

import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.Repair;
import com.example.lab.Entity.User;
import com.example.lab.Service.BreakdownEquipmentService;
import com.example.lab.Service.RepairProcessService;
import com.example.lab.Service.UserService;
import com.example.lab.Util.RetUtil;
import com.example.lab.common.Ret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Objects;

@Controller("RepairProcessController")

public class RepairProcessController {
    @Autowired
    private RepairProcessService service;
    @Autowired
    private BreakdownEquipmentService breakdownEquipmentService;
    @Autowired
    private UserService userService;

    // 添加维修历史列表
    public Ret<?> add(Repair repair){
        User user = userService.get(repair.getRepairPerson());
        if(Objects.isNull(user)){
            return RetUtil.failure("维修用户人为空");
        }
        Breakdown breakdown = breakdownEquipmentService.getById(repair.getBreakdownId());
        if(Objects.isNull(breakdown)){
            return RetUtil.failure("损坏记录不存在");
        }
        service.add(repair);
        return RetUtil.successWithMsg("添加成功");

    }

    // 获取维修历史列表
    public Ret<?> get(){
        return RetUtil.success(service.get());
    }

}
