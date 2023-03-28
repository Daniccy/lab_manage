package com.example.lab.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ExportExcelControllerTest {
    @Autowired
    private ExportExcelController controller;

    @Test
    void export() throws IOException {
        controller.export();
    }
}