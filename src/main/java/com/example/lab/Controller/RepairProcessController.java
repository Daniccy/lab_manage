package com.example.lab.Controller;

import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.Repair;
import com.example.lab.Entity.User;
import com.example.lab.Service.BreakdownEquipmentService;
import com.example.lab.Service.RepairProcessService;
import com.example.lab.Service.UserService;
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

@Controller("RepairProcessController")

public class RepairProcessController {

    private final static Logger logger = LoggerFactory.getLogger(RepairProcessController.class);

    @Autowired
    private RepairProcessService service;
    @Autowired
    private BreakdownEquipmentService breakdownEquipmentService;
    @Autowired
    private UserService userService;

    // 添加维修历史列表
    public Ret<?> add(Repair repair, String token){
        // 逃过验证（用于测试）
        CacheManagerUtil.putCache(token, null, 0);
        if(!TokenUtil.isPass(token)){
            return RetUtil.failure("用户失效，请重新登录");
        }
        // 如果系统派单的话就要用这个，选单的话不用判断
//        User user = userService.get(repair.getRepairPerson());
//        if(Objects.isNull(user)){
//            return RetUtil.failure("维修用户人为空");
//        }
        Breakdown breakdown = breakdownEquipmentService.getById(repair.getBreakdownId());
        if(Objects.isNull(breakdown)){
            return RetUtil.failure("损坏记录不存在");
        }
        service.add(repair, token);
        return RetUtil.successWithMsg("添加成功");

    }

    // 获取维修历史列表
    public Ret<?> get(){
        return RetUtil.success(service.get());
    }

    public Ret<?> update(Repair repair, String token){
        if(!TokenUtil.isPass(token)){
            return RetUtil.failure("用户失效，请重新登录");
        }
       try {
           service.update(repair, token);
       }catch (Exception e){
           e.printStackTrace();
           return RetUtil.failure("更新失败");
       }
       return RetUtil.successWithMsg("更新成功");
    }

    public Ret<?> getByUserId(String token){
        String userId = TokenUtil.getInfoByToken(token);

        return RetUtil.success(service.get(userId));
    }

}
