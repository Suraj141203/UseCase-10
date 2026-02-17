package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.ShoppingDTO;

public class ShoppingForm extends BaseForm {

    @NotEmpty(message = "please enter productName")
    private String productName;

    @NotEmpty(message = "please enter shopName")
    private String shopName;

    @NotEmpty(message = "please enter productPrice")
    private String productPrice;

    @NotNull(message = "please enter dob")
    private Date dob;

    // getters / setters

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public ShoppingDTO getDto() {
        ShoppingDTO dto = initDTO(new ShoppingDTO());
        dto.setProductName(productName);
        dto.setShopName(shopName);
        dto.setProductPrice(productPrice);
        dto.setDob(dob);
        return dto;
    }
}
