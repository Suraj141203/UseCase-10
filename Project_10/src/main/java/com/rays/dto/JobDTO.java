package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_JOB")
public class JobDTO extends BaseDTO {

	@Column(name = "JOB_TITLE", length = 50)
	private String jobTitle;

	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	@Column(name = "EXPERIENCE", length = 20)
	private String experience;

	@Column(name = "DEPARTMENT", length = 50)
	private String department;

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String getValue() {
		return jobTitle;
	}

	@Override
	public String getUniqueKey() {
		return "jobTitle";
	}

	@Override
	public String getUniqueValue() {
		return jobTitle;
	}

	@Override
	public String getLabel() {
		return jobTitle;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("jobTitle", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("jobTitle", jobTitle);
		return map;
	}
}
