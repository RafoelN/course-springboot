package com.projectrafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectrafael.course.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{
	
}
