package com.example.dao;

import java.util.List;

import com.example.entity.Product;

public interface ProductDao {

	Product deleteById(int id);

	List<Product> getAllProducts();

	Product getProductById(int id);

	Product insertProduct(Product p);

	Product updateProduct(Product p);
}
