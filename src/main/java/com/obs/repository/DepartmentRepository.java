package com.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obs.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
