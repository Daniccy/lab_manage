package com.example.lab.Controller;

import com.example.lab.Entity.Breakdown;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class breakdownEquipmentControllerTest {
    @Autowired
    private breakdownEquipmentController controller;

    @Test
    void add() {
        Breakdown b = new Breakdown();
        b.setEquipmentId(12);
        b.setApplyTime(new Date());
        b.setApplyReason("sfsd");
        b.setApplyPerson("邓丽诗");
        b.setNum(1);
        controller.add(b);
    }

    @Test
    void get() {
        controller.get(2);
    }
}