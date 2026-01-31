package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_POSITION")
public class PositionDTO extends BaseDTO{
	
	@Column(name = "DESIGNATION", length = 50)
	private String designation;
	
	@Column(name = "OPENING_DATE")
	private Date openingDate;

	@Column(name = "REQUIRED_EXPERIENCE", length = 50)
	private String requiredExperience;

	@Column(name = "CONDITIONS")
	private String condition;
	
	

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public String getRequiredExperience() {
		return requiredExperience;
	}

	public void setRequiredExperience(String requiredExperience) {
		this.requiredExperience = requiredExperience;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("designation", "asc");
		
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("designation", designation);
		return map;
	}

}
