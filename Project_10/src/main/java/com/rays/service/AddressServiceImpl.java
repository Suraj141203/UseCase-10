package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.AddressDAOInt;
import com.rays.dto.AddressDTO;

@Service
@Transactional
public class AddressServiceImpl
        extends BaseServiceImpl<AddressDTO, AddressDAOInt>
        implements AddressServiceInt {

}
