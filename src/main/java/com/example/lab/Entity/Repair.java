package com.example.lab.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class Repair {
	private int repairId;
	private String repairPerson;
	private Date repairTime;
	private int breakdownId;

}
