package com.example.service;

import java.util.List;

import com.example.entity.Product;

public interface ProductService {

	Product insertProduct(Product p);

	Product getProductById(int id);

	List<Product> getAllProducts();

	Product deleteProduct(int id);

	Product updateProduct(Product p);

}