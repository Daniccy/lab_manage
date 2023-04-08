package com.example.lab.Entity;

import lombok.Data;

import java.text.SimpleDateFormat;
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

		if(String.valueOf(returnTime).equals("null")){
			String[] a={String.valueOf(borrowId), equipmentName, String.valueOf(number),borrower, new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(borrowTime),isReturn, String.valueOf(returnTime),isDamage};
			return a;
		}else
		{
			String[] a={String.valueOf(borrowId), equipmentName, String.valueOf(number),borrower, new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(borrowTime),isReturn, new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(returnTime),isDamage};
			return a;
		}

	}

}
