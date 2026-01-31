package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AddressDTO;

@Repository
public class AddressDAOImpl extends BaseDAOImpl<AddressDTO> implements AddressDAOInt {

    @Override
    protected List<Predicate> getWhereClause(AddressDTO dto,
            CriteriaBuilder builder, Root<AddressDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (!isEmptyString(dto.getPersonName())) {
            whereCondition.add(
                builder.like(qRoot.get("personName"), dto.getPersonName() + "%"));
        }

        if (!isEmptyString(dto.getCity())) {
            whereCondition.add(
                builder.equal(qRoot.get("city"), dto.getCity()));
        }

        if (!isEmptyString(dto.getState())) {
            whereCondition.add(
                builder.equal(qRoot.get("state"), dto.getState()));
        }

        if (!isEmptyString(dto.getPincode())) {
            whereCondition.add(
                builder.equal(qRoot.get("pincode"), dto.getPincode()));
        }

        return whereCondition;
    }

    @Override
    public Class<AddressDTO> getDTOClass() {
        return AddressDTO.class;
    }
}
