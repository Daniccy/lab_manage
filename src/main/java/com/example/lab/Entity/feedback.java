package com.example.lab.Entity;

import lombok.Data;

import java.util.Date;

@Data
public class feedback {
	private String feedbackId;
	private String userId;
	private String question;
	private String detail;
	private String answer;
	private Date time;

}
