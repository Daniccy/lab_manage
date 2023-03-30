package com.example.lab.Controller;

import com.example.lab.Entity.Breakdown;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class breakdownEquipmentControllerTest {
    @Autowired
    private breakdownEquipmentController controller;
	String token = "eyJUeXBlIjoiand0IiwidHlwIjoiSldUIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE2ODAyMzMyMjYsInVzZXJJZCI6IjAwMTEifQ.vJMOKRcTQsNVoIan8XtVn2GcmnwZ6QZN7osaIl7X4F0";


    @Test
    void add() {
        Breakdown b = new Breakdown();
        b.setEquipmentName("办公桌");
        b.setApplyReason("sfsd");
        b.setNum(2);
        controller.add(b, token);
    }

    @Test
    void get() {
        controller.get();
    }
}