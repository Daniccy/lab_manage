package com.example.lab.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class Equipment {
	private int equipmentId;
	private String equipmentName;
	private String equipmentType;
	private Date date;
	private int number;
	private Double singlePrice;
	private String fromFactory;
	private String remark;

	public Equipment(String equipmentName, String equipmentType, int number, Double singlePrice, String fromFactory, String remark) {
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.number = number;
		this.singlePrice = singlePrice;
		this.fromFactory = fromFactory;
		this.remark = remark;
	}

	public Equipment(int equipmentId, String equipmentName, String equipmentType, Date date, int number, Double singlePrice, String fromFactory, String remark) {
		this.equipmentId = equipmentId;
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.date = date;
		this.number = number;
		this.singlePrice = singlePrice;
		this.fromFactory = fromFactory;
		this.remark = remark;
	}

	public Equipment() {
	}

	public Equipment(int equipmentId, String equipmentName, String equipmentType, int number, Double singlePrice, String fromFactory, String remark) {
		this.equipmentId = equipmentId;
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.number = number;
		this.singlePrice = singlePrice;
		this.fromFactory = fromFactory;
		this.remark = remark;
	}

	public String[] get_eq(){
		String[] eq={String.valueOf(equipmentId),equipmentName,equipmentType, String.valueOf(date), String.valueOf(number), String.valueOf(singlePrice),fromFactory,remark};
		return eq;
	}
}
