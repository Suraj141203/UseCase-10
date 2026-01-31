package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.AddressDTO;
import com.rays.form.AddressForm;
import com.rays.service.AddressServiceInt;

@RestController
@RequestMapping(value = "Address")
public class AddressCtl
        extends BaseCtl<AddressForm, AddressDTO, AddressServiceInt> {

}
