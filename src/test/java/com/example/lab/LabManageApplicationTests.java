package com.example.lab;

import com.example.lab.Controller.BasicEquipmentController;
import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Entity.Equipment;
import com.example.lab.UI.select_equipment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class LabManageApplicationTests {

	@Autowired
	private BasicEquipmentController basicEquipmentController;
	@Autowired
	private select_equipment select_equipment;

	@Test
	void contextLoads() {
		//select_equipment.init();
		basicEquipmentController.getEquipment();
	}







}
