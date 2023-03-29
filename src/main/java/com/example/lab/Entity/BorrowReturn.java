package com.example.lab.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class BorrowReturn {
	private int borrowId;
	private int equipmentId;
	private int number;
	private String borrower;
	private Date borrowTime;
	private String isReturn;
	private Date returnTime;
	private String isDamage;
	private String equipmentName;

	public String[] get_eq(){
		String[] a={String.valueOf(borrowId), equipmentName, String.valueOf(number),borrower, String.valueOf(borrowTime),isReturn, String.valueOf(returnTime),isDamage};
		return a;
	}

}
