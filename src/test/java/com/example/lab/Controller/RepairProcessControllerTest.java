package com.example.lab.Controller;

import com.example.lab.Entity.Repair;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RepairProcessControllerTest {
    @Autowired
    private RepairProcessController controller;
	String token = "eyJUeXBlIjoiand0IiwidHlwIjoiSldUIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE2ODAyMzMyMjYsInVzZXJJZCI6IjAwMTEifQ.vJMOKRcTQsNVoIan8XtVn2GcmnwZ6QZN7osaIl7X4F0";


    @Test
    void add() {
        Repair r = new Repair();
        r.setBreakdownId(6);
        controller.add(r, token);
    }

    @Test
    void get() {
        controller.get();
    }
}