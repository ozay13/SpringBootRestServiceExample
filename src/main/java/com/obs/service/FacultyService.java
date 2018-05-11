package com.obs.service;

import org.springframework.stereotype.Service;

import com.obs.repository.FacultyRepository;

@Service
public class FacultyService extends BaseService<FacultyRepository> {

	public FacultyService() {
		super(FacultyService.class);
	}

}
