package com.projectjava.corse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectjava.corse.entities.Product;
import com.projectjava.corse.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id){
		Optional<Product> Product = repository.findById(id);
		return Product.get();
	}
}
