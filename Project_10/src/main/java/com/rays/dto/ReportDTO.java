package com.rays.dto;


import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_REPORT")
public class ReportDTO extends BaseDTO {

	@Column(name = "REPORT_NAME", length = 50)
	private String reportName;

	@Column(name = "GENERATED_DATE")
	private Date generatedDate;

	@Column(name = "GENERATED_BY", length = 50)
	private String generatedBy;

	@Column(name = "REPORT_STATUS", length = 20)
	private String reportStatus;

	// ================= Getters & Setters =================

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	

	public Date getGeneratedDate() {
		return generatedDate;
	}

	public void setGeneratedDate(Date generatedDate) {
		this.generatedDate = generatedDate;
	}

	public String getGeneratedBy() {
		return generatedBy;
	}

	public void setGeneratedBy(String generatedBy) {
		this.generatedBy = generatedBy;
	}

	public String getReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

	// ================= BaseDTO Methods =================

	@Override
	public String getValue() {
		return reportName;
	}

	@Override
	public String getUniqueKey() {
		return "reportName";
	}

	@Override
	public String getUniqueValue() {
		return reportName;
	}

	@Override
	public String getLabel() {
		return "reportName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("reportName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("reportName", reportName);
		return map;
	}
}
