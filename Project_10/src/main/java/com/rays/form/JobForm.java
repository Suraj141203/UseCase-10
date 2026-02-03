package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.JobDTO;

public class JobForm extends BaseForm {

	@NotEmpty(message = "Please enter job title")
	private String jobTitle;

	@NotNull(message = "Please enter joining date")
	private Date joiningDate;

	@NotEmpty(message = "Please select experience")
	private String experience;

	@NotEmpty(message = "Please enter department")
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
	public JobDTO getDto() {
		JobDTO dto = initDTO(new JobDTO());
		dto.setJobTitle(jobTitle);
		dto.setJoiningDate(joiningDate);
		dto.setExperience(experience);
		dto.setDepartment(department);
		return dto;
	}
}
