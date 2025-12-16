package com.projectjava.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectjava.corse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
