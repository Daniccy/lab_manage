package com.example.lab.Controller;

import com.example.lab.Entity.BorrowReturn;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BasicEquipmentControllerTest {
    @Autowired
    private BasicEquipmentController controller;
	String token = "eyJUeXBlIjoiand0IiwidHlwIjoiSldUIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE2ODAyMzMyMjYsInVzZXJJZCI6IjAwMTEifQ.vJMOKRcTQsNVoIan8XtVn2GcmnwZ6QZN7osaIl7X4F0";

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void name() {
    }

    @Test
    void addEquipment() {
    }

    @Test
    void getEquipment() {
        controller.getEquipment();
    }

    @Test
    void updateEquipment() {
    }

    @Test
    void insertBorrow() {
        BorrowReturn b = new BorrowReturn();
	    b.setEquipmentName("办公桌");
        b.setNumber(5);
        controller.insertBorrow(b, token);
    }

    @Test
    void returnBorrow() {
        BorrowReturn b = new BorrowReturn();
        b.setBorrowId(7);
        b.setIsDamage("no");
        controller.returnBorrow(b);
    }

    @Test
    void get() {
        controller.get();
    }

//    @Test
//    void update() {
//        BorrowReturn b = new BorrowReturn();
//        b.setBorrowId(7);
//        b.setBorrowTime(new Date());
//        b.setNumber(3);
//        controller.update(b);
//    }
}