package com.example.lab.Entity;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Feedback {
	//@ExcelProperty("日志ID")
	private String feedbackId;
	//@ExcelProperty("用户ID")
	private String userId;
	//@ExcelProperty("日志来源")
	private String question;
	//@ExcelProperty("日志详情")
	private String detail;
	//@ExcelProperty("日志行为")
	private String answer;
	//@ExcelProperty("日志生成时间")
	private Date time;

	public String[] get_eq(){
		String[] a={feedbackId,userId,question,detail,answer, new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time)};
		return a;
	}


}
