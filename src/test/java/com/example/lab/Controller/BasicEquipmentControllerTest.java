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
    }

    @Test
    void updateEquipment() {
    }

    @Test
    void insertBorrow() {
        BorrowReturn b = new BorrowReturn();
        b.setBorrowId(12);
        b.setBorrowTime(new Date());
        b.setNumber(2);
        controller.insertBorrow(b);
    }

    @Test
    void returnBorrow() {
        BorrowReturn b = new BorrowReturn();
        b.setBorrowId(12);
        b.setBorrowTime(new Date());
        b.setNumber(2);
        controller.returnBorrow(b);
    }

    @Test
    void get() {
        controller.get(1);
    }

    @Test
    void update() {
        BorrowReturn b = new BorrowReturn();
        b.setBorrowId(12);
        b.setBorrowTime(new Date());
        b.setNumber(2);
        controller.update(b);
    }
}