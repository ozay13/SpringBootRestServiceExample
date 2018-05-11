package com.obs.service;

import javax.persistence.MappedSuperclass;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import open.core.mapper.ModelMapper;

/**
 * 
 * @author otunctan
 *
 * @param <R>
 */
@MappedSuperclass
public class BaseService<R extends JpaRepository<?, ?>> {

	@Autowired
	protected R repository;

	protected ModelMapper mapper;

	protected Logger logger = null;

	public BaseService(Object obj) {
		logger = Logger.getLogger(obj.getClass());
		mapper = new ModelMapper();
		
	
	}
}
