package com.example.lab;

import com.example.lab.Controller.BasicEquipmentController;
import com.example.lab.Entity.BorrowReturn;
import com.example.lab.Entity.Equipment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class LabManageApplicationTests {

	@Autowired
	private BasicEquipmentController basicEquipmentController;
	@Test
	void contextLoads() {
	}


	@Test
	void getEquipment(){
		System.out.println(basicEquipmentController.getEquipment());
	}

	@Test
	void addEquipment(){
		Equipment e = new Equipment();
		e.setDate(new Date());
		e.setEquipmentId(111);
		e.setEquipmentName("hs");
		e.setEquipmentType("ss");
		basicEquipmentController.addEquipment(e);

	}

	@Test
	void updateEquipment(){
		Equipment e = new Equipment();
		e.setEquipmentId(12);
		e.setEquipmentName("has");
		e.setEquipmentType("ss");
		e.setNumber(10);
		e.setRemark("hh");
		e.setSinglePrice(12.0);
		e.setFromFactory("ty");
		basicEquipmentController.updateEquipment(e);

	}

	@Test
	void insertBorrow(){
		BorrowReturn b = new BorrowReturn();
		basicEquipmentController.insertBorrow(b);

	}






}
