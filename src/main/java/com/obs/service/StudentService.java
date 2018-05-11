package com.obs.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.obs.dto.FacultyDto;
import com.obs.dto.StudentDto;
import com.obs.repository.StudentRepository;

import open.core.service.ServiceResult;

@Service
public class StudentService extends BaseService<StudentRepository> {

	public StudentService() {
		super(StudentService.class);
	}

	public ServiceResult<StudentDto> getStudentByNumber(String studentNumber) {
		logger.info("getStudentByNumber() metod call..");
		StudentDto student = null;
		if (studentNumber != null && !studentNumber.isEmpty()) {
			student = repository.getStudentDetailByStudentNumber(studentNumber);
		}
		return new ServiceResult<StudentDto>(student);
	}

}
