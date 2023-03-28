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

    @Test
    void add() {
        Repair r = new Repair();
        r.setBreakdownId(7);
        r.setRepairPerson("0014");
        controller.add(r);
    }

    @Test
    void get() {
        controller.get();
    }
}