package com.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.obs.dto.StudentDto;
import com.obs.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("select new com.obs.dto.StudentDto(ss,d.countYear,d.name,f.name) "
			+ " from Student ss join ss.Department d join d.Faculty f where ss.number=?1 ")
	public  StudentDto getStudentDetailByStudentNumber(String studentNumber);
}
