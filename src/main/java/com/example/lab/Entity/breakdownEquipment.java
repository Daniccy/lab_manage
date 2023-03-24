package com.example.lab.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class breakdownEquipment {
	private int breakdownId;
	private String equipmentName;
	private String applyReason;
	private String applyPerson;
	private Date applyTime;


}
