package com.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obs.model.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
