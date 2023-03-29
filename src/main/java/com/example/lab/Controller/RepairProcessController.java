package com.example.lab.Controller;

import com.example.lab.Entity.Repair;
import com.example.lab.Service.RepairProcessService;
import com.example.lab.common.Ret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("RepairProcessController")

public class RepairProcessController {
    @Autowired
    private RepairProcessService service;

    // 添加维修历史列表
    public Ret add(Repair repair){
        service.add(repair);
        return new Ret("success", null);

    }

    // 获取维修历史列表
    public Ret get(){
        return new Ret("success",service.get());
    }

}
