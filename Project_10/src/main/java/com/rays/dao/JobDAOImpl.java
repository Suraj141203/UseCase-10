package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.JobDTO;

@Repository
public class JobDAOImpl extends BaseDAOImpl<JobDTO> implements JobDAOInt {

	@Override
	protected List<Predicate> getWhereClause(JobDTO dto, CriteriaBuilder builder, Root<JobDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getJobTitle())) {
			whereCondition.add(builder.like(qRoot.get("jobTitle"), dto.getJobTitle() + "%"));
		}

		if (isNotNull(dto.getJoiningDate())) {
			whereCondition.add(builder.equal(qRoot.get("joiningDate"), dto.getJoiningDate()));
		}

		if (!isEmptyString(dto.getExperience())) {
			whereCondition.add(builder.equal(qRoot.get("experience"), dto.getExperience()));
		}

		if (!isEmptyString(dto.getDepartment())) {
			whereCondition.add(builder.like(qRoot.get("department"), dto.getDepartment() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<JobDTO> getDTOClass() {
		return JobDTO.class;
	}
}
