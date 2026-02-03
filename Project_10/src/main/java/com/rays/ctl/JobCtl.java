package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.JobDTO;
import com.rays.form.JobForm;
import com.rays.service.JobServiceInt;

@RestController
@RequestMapping(value = "Job")
public class JobCtl extends BaseCtl<JobForm, JobDTO, JobServiceInt> {

}
