package com.obs.service;

import org.springframework.stereotype.Service;

import com.obs.repository.LessonRepository;

@Service
public class LessonService extends BaseService<LessonRepository> {

	public LessonService() {
		super(LessonService.class);
	}

}
