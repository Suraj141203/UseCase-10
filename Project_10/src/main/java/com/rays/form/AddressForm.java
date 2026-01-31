package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.AddressDTO;

public class AddressForm extends BaseForm {

    @NotEmpty(message = "Please enter person name")
    private String personName;

    @NotEmpty(message = "Please select city")
    private String city;

    @NotEmpty(message = "Please select state")
    private String state;

    @NotEmpty(message = "Please enter pincode")
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

    @Override
    public AddressDTO getDto() {
        AddressDTO dto = initDTO(new AddressDTO());
        dto.setPersonName(personName);
        dto.setCity(city);
        dto.setState(state);
        dto.setPincode(pincode);
        return dto;
    }
}
