package com.projectjava.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectjava.corse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
