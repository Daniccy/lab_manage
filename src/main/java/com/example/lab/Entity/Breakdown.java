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
	private String equipmentName;


	public int getBreakdownId() {
		return breakdownId;
	}

	public void setBreakdownId(int breakdownId) {
		this.breakdownId = breakdownId;
	}

	public int getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getApplyReason() {
		return applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public String getApplyPerson() {
		return applyPerson;
	}

	public void setApplyPerson(String applyPerson) {
		this.applyPerson = applyPerson;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
}
