package com.projectrafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectrafael.course.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{
	
}