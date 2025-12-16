package com.projectjava.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectjava.corse.entities.OrderItem;
import com.projectjava.corse.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
