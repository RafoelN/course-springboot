package com.projectrafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectrafael.course.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long>{
	
}