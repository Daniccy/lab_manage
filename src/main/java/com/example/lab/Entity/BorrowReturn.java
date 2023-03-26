package com.example.lab.Entity;

import lombok.Data;

import java.util.Date;

@Data

public class BorrowReturn {
	private int borrowId;
	private int equipmentId;
	private int equipmentName;
	private int number;
	private String borrower;
	private Date borrowTime;
	private String isReturn;
	private Date returnTime;
	private String isDamage;

}
