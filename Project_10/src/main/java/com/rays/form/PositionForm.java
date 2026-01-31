package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.PositionDTO;

public class PositionForm extends BaseForm {
	
	@NotEmpty(message = "please enter designation")
	private String designation;
	
	@NotNull(message = "please enter openingDate")
	private Date openingDate;

	@NotEmpty(message = "please enter requiredExperience")
	private String requiredExperience;

	@NotEmpty(message = "please enter condition")
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
	public PositionDTO getDto() {

		PositionDTO dto = initDTO(new PositionDTO());
		dto.setDesignation(designation);
		dto.setOpeningDate(openingDate);
		dto.setRequiredExperience(requiredExperience);
		dto.setCondition(condition);
		return dto;
	}

}
