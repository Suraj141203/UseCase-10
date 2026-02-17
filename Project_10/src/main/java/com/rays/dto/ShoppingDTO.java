package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_SHOPPING")
public class ShoppingDTO extends BaseDTO {

    @Column(name = "PRODUCT_NAME", length = 50)
    private String productName;

    @Column(name = "SHOP_NAME", length = 50)
    private String shopName;

    @Column(name = "PRODUCT_PRICE", length = 50)
    private String productPrice;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "DOB")
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

    // BaseDTO abstract methods

    @Override
    public String getValue() {
        return productName;
    }

    @Override
    public String getUniqueKey() {
        // unique field used for business uniqueness, change if needed
        return "productName";
    }

    @Override
    public String getUniqueValue() {
        return productName;
    }

    @Override
    public String getLabel() {
        return productName;
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("productName", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("productName", productName);
        return map;
    }
}
