package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Product;
import com.simplilearn.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public void addProducts(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public Product updateProduct(int id) {
		Optional<Product> optional= productRepository.findById(id);
		Product product=null;
		if(optional.isPresent()) {
			product=optional.get();
		}
		else {
			throw new ArithmeticException("id is not present ");
		}
		
		
		return product;
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
		
		
	}
	

}
