package com.example.lab.Controller;

import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Entity.Equipment;
import com.example.lab.Entity.User;
import com.example.lab.Service.BasicEquipmentService;
import com.example.lab.Util.CacheManagerUtil;
import com.example.lab.Util.RetUtil;
import com.example.lab.Util.TokenUtil;
import com.example.lab.common.Ret;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Objects;

@Controller("BasicEquipmentController")
public class BasicEquipmentController {
    private final static Logger logger = LoggerFactory.getLogger(BasicEquipmentController.class);
    @Autowired
    private BasicEquipmentService service;

    // 增加设备
    public Ret<?> addEquipment(Equipment equipment,String token){
        if(!TokenUtil.isPass(token)){
            return RetUtil.failure("用户失效，请重新登录");
        }
        Equipment oldEquipment = service.getByName(equipment.getEquipmentName());
        if(!Objects.isNull(oldEquipment)){
           return RetUtil.failure("该设备已存在");
        }
        service.addEquipment(equipment);
        return RetUtil.successWithMsg("添加成功");
    }

    // 获取设备
    public Ret<?> getEquipment(){
        return RetUtil.success(service.getEquipment());
    }

    // 更新设备
    public Ret<?> updateEquipment(Equipment equipment,String token){
        if(!TokenUtil.isPass(token)){
            return RetUtil.failure("用户失效，请重新登录");
        }
        if(equipment.getEquipmentId() == 0){
            return RetUtil.failure("设备ID不允许为空");
        }
        service.updateEquipment(equipment);
        return RetUtil.successWithMsg("更新成功");
    }


    // 借设备
    public Ret<?> insertBorrow(BorrowReturn borrowReturn,String token) {
        // 逃过验证（用于测试）
        CacheManagerUtil.putCache(token, null, 0);
        if(!TokenUtil.isPass(token)){
            return RetUtil.failure("用户失效，请重新登录");
        }
        if(borrowReturn.getEquipmentName() == null) {
            return RetUtil.failure("设备ID不允许为空");
        }
        Equipment equipment = service.getByName(borrowReturn.getEquipmentName());
        if(Objects.isNull(equipment) || equipment.getNumber() < borrowReturn.getNumber()){
            return RetUtil.failure("不存在该设备或设备数量不足");
        }
        service.insertBorrow(borrowReturn, token);
        return RetUtil.success("借用成功");
    }

    // 还设备
    public Ret<?> returnBorrow(BorrowReturn borrowReturn) {
        // 根据borrowID找是否存在
        BorrowReturn isExist = service.getWithBorrowById(borrowReturn.getBorrowId());
        if(Objects.isNull(isExist)){
            return RetUtil.successWithMsg("不存在该借用记录");
        }
        service.returnBorrow(borrowReturn);
        return RetUtil.success("归还成功");
    }


    // 获取设借出/归还备信息
    public Ret<?> get() {
        return RetUtil.success(service.get());
    }

    // 更新借出/归还设备信息
    public Ret<?> update(BorrowReturn borrowReturn, String token) {
        if(!TokenUtil.isPass(token)){
            return RetUtil.failure("用户失效，请重新登录");
        }

        BorrowReturn isExistBorrow = service.getWithBorrowById(borrowReturn.getBorrowId());
        Equipment isExistEquipment = service.getByName(borrowReturn.getEquipmentName());
        if(Objects.isNull(isExistBorrow)){
            return RetUtil.successWithMsg("不存在该借用记录");
        }
        if(Objects.isNull(isExistEquipment) || isExistEquipment.getNumber() < borrowReturn.getNumber()){
            return RetUtil.success("该设备不存在或者设备数量不足");
        }

        service.update(borrowReturn, token);
        return RetUtil.successWithMsg("更新成功");
    }
}
