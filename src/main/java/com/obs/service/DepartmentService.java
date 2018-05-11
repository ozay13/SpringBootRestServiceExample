package com.obs.service;

import org.springframework.stereotype.Service;

import com.obs.repository.DepartmentRepository;

@Service
public class DepartmentService extends BaseService<DepartmentRepository> {

	public DepartmentService() {
		super(DepartmentService.class);
	}

}
