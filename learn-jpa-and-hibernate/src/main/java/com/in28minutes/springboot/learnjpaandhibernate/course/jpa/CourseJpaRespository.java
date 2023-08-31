package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
public class CourseJpaRespository {
	
	@PersistentenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
		
	public Course findById(long id) {
		entityManager.find(Course.class, Id);
		return entityManager.find(Course.class, id);
	}
	}

}
