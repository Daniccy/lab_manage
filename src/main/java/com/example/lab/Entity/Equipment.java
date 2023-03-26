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
}
