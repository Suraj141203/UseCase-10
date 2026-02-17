package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ShoppingDTO;

@Repository
public class ShoppingDAOImpl extends BaseDAOImpl<ShoppingDTO> implements ShoppingDAOInt {

    @Override
    protected List<Predicate> getWhereClause(ShoppingDTO dto, CriteriaBuilder builder, Root<ShoppingDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (!isEmptyString(dto.getProductName())) {
            whereCondition.add(builder.like(qRoot.get("productName"), dto.getProductName() + "%"));
        }

        if (!isEmptyString(dto.getShopName())) {
            whereCondition.add(builder.like(qRoot.get("shopName"), dto.getShopName() + "%"));
        }

        if (!isEmptyString(dto.getProductPrice())) {
            whereCondition.add(builder.like(qRoot.get("productPrice"), dto.getProductPrice() + "%"));
        }

        if (isNotNull(dto.getDob())) {
            whereCondition.add(builder.equal(qRoot.get("dob"), dto.getDob()));
        }

        return whereCondition;
    }

    @Override
    public Class<ShoppingDTO> getDTOClass() {
        return ShoppingDTO.class;
    }
}
