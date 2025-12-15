package com.projectjava.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectjava.corse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
