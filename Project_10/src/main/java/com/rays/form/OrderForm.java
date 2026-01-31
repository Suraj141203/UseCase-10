package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;

public class OrderForm extends BaseForm{
	
	@NotEmpty(message = "please enter productName")
	private String productName;

	@NotNull(message = "please enter orderDate")
	private Date orderDate;

	@NotNull(message = "please enter quantity")
	private Integer quantity;

	@NotEmpty(message = "please enter cutomer")
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
	public OrderDTO getDto() {

		OrderDTO dto = initDTO(new OrderDTO());
		dto.setProductName(productName);
		dto.setOrderDate(orderDate);
		dto.setQuantity(quantity);
		dto.setCustomer(customer);
		return dto;
	}


}
