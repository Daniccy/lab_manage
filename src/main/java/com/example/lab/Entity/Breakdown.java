package com.example.lab.Entity;

import lombok.Data;

import java.util.Date;


@Data
public class Breakdown {
	private int breakdownId;
	private int equipmentId;
	private String applyReason;
	private String applyPerson;
	private Date applyTime;
	private int num;

}
