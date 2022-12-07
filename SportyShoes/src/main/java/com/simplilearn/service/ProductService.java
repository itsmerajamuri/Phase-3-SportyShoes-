package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	
	public void addProducts(Product product);
	
	public Product updateProduct (int id);
	
	public void deleteProduct(int id);
	
	
}
