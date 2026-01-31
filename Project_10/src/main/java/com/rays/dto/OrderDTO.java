package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ORDER")
public class OrderDTO extends BaseDTO {
	
	@Column(name = "PRODUCT_NAME", length = 50)
	private String productName;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "ORDER_DATE")
	private Date orderDate;

	@Column(name = "QUANTITY")
	private Integer quantity;

	@Column(name = "CUSTOMER", length = 50)
	private String customer;
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}


	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "productName";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "productName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return "productName";
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "productName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("productName", "asc");
		
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("productName", productName);
		return map;
	}

}
