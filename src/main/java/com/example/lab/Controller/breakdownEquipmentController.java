package com.example.lab.Controller;

import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.Equipment;
import com.example.lab.Service.BasicEquipmentService;
import com.example.lab.Service.BreakdownEquipmentService;
import com.example.lab.Util.CacheManagerUtil;
import com.example.lab.Util.RetUtil;
import com.example.lab.Util.TokenUtil;
import com.example.lab.common.Ret;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Objects;

@Controller("breakdownEquipmentController")

public class breakdownEquipmentController {
    private final static Logger logger = LoggerFactory.getLogger(breakdownEquipmentController.class);
    @Autowired
    private BreakdownEquipmentService service;
    @Autowired
    private BasicEquipmentService basicEquipmentService;
    // 增加损坏设备
    public Ret<?> add(Breakdown breakdown, String token){
        // 逃过验证（用于测试）
        CacheManagerUtil.putCache(token, null, 0);
        if(!TokenUtil.isPass(token)){
            return RetUtil.failure("用户失效，请重新登录");
        }
        if(breakdown.getEquipmentName() == null){
            return RetUtil.failure("设备名称不允许为空");
        }
        Equipment equipment = basicEquipmentService.getByName(breakdown.getEquipmentName());
        if(Objects.isNull(equipment)){
            return RetUtil.failure("设备不存在");
        }
        breakdown.setEquipmentId(equipment.getEquipmentId());
        service.add(breakdown, token);
        return RetUtil.successWithMsg("添加成功");
    }
    // 获取损坏设备
    public Ret<?> get(){
        return RetUtil.success(service.get());
    }

    // 更新
    public Ret<?> update(Breakdown breakdown, String token){
        CacheManagerUtil.putCache(token, null, 0);
        if(!TokenUtil.isPass(token)){
            return RetUtil.failure("用户失效，请重新登录");
        }
        if(breakdown.getEquipmentName() == null){
            return RetUtil.failure("设备名称不允许为空");
        }
        Equipment equipment = basicEquipmentService.getByName(breakdown.getEquipmentName());
        if(Objects.isNull(equipment)){
            return RetUtil.failure("设备不存在");
        }
        breakdown.setEquipmentId(equipment.getEquipmentId());
        service.update(breakdown, token);
        return RetUtil.successWithMsg("更新成功");
    }

    // 获取损坏设备
    public Ret<?> getByUserId(String token){
        String userId = TokenUtil.getInfoByToken(token);
        return RetUtil.success(service.getByUserId(userId));
    }


}
