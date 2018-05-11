package com.obs.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obs.dto.GenericParameterDto;
import com.obs.dto.StudentDto;
import com.obs.model.Department;
import com.obs.model.Faculty;
import com.obs.model.Student;
import com.obs.repository.DepartmentRepository;
import com.obs.repository.FacultyRepository;
import com.obs.repository.StudentRepository;
import com.obs.service.StudentService;

@RestController
// @RequestMapping(path = "/api/students", consumes =
// MediaType.APPLICATION_JSON_VALUE, produces =
// MediaType.APPLICATION_JSON_VALUE)
public class StudentApiController {
	private Logger logger = Logger.getLogger(StudentApiController.class);
	@Autowired
	private StudentService studentService;
	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private FacultyRepository facultyRepository;
	@Autowired
	StudentRepository studentRepository;

	// @PostMapping(value = "/getStudentByNumber")
	@RequestMapping(path = "/getStudentByNumber", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentDto> getStudentByStudentNumber(@RequestBody GenericParameterDto<String> parameter) {
		logger.info("getStudentByStudentNumber() metod call...");
		StudentDto dt = studentService.getStudentByNumber(parameter.getValue()).getData();
		return ResponseEntity.status(dt != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST).body(dt);
	}
	
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> create() {
		logger.info("getStudentByStudentNumber() metod call...");
		Faculty fc = new Faculty();
		fc.setCode("MMF-100");
		fc.setName("Mühendislik ve Mimarlık Fakültesi");
		fc = facultyRepository.save(fc);
		Department dtt = new Department();
		dtt.setCode("BMH-100");
		dtt.setCountYear(4);
		dtt.setFaculty(fc);
		dtt.setName("Bilgisayar Mühendisliği");
		dtt = departmentRepository.save(dtt);
		Student ss = new Student();
		ss.setNumber("201712345");
		ss.setFirstName("Ozay");
		ss.setLastName("TUNCTAN");
		ss.setAdress("Bitlis");
		ss.setDepartment(dtt);
		ss.setGender(Boolean.TRUE);
		ss.setIdentityNumber("12345678901");
		ss.setPhone("053801104567");
		ss=studentRepository.save(ss);
		return ResponseEntity.status(ss != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST).body(ss);
	}
}
