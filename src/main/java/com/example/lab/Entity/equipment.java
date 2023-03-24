package com.example.lab.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class equipment {
	private int equipmentId;
	private int equipmentName;
	private int equipmentType;
	private Date date;
	private int number;
	private Double singlePrice;
	private String fromFactory;
	private String remark;


}
