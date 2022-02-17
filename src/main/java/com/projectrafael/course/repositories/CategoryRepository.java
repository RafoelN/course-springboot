package com.projectrafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectrafael.course.entities.Category;

public interface CategoryRepository extends JpaRepository <Category, Long>{
	
}