package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ADDRESS")
public class AddressDTO extends BaseDTO {

    @Column(name = "PERSON_NAME", length = 50)
    private String personName;

    @Column(name = "CITY", length = 50)
    private String city;

    @Column(name = "STATE", length = 50)
    private String state;

    @Column(name = "PINCODE", length = 10)
    private String pincode;

    // ---------- getters & setters ----------

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    // ---------- BaseDTO methods ----------

    @Override
    public String getValue() {
        return personName;
    }

    @Override
    public String getUniqueKey() {
        return "personName";
    }

    @Override
    public String getUniqueValue() {
        return personName;
    }

    @Override
    public String getLabel() {
        return "personName";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("personName", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("personName", personName);
        return map;
    }
}
