package com.example.controller;

import java.util.List;

import com.example.exceptions.IdNotFoundException;
import com.example.service.ProductService;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Product;

@RestController
@RequestMapping("/products")
//@CrossOrigin("http://localhost:4200")
public class ProductController {
	@Autowired
	ProductService serviceobj;

	// Create Employee
	@PostMapping("/addproduct")
	public ResponseEntity<String> employeeCreation(@RequestBody Product emp) {
		Product e = serviceobj.insertProduct(emp);
		
			return new ResponseEntity<String>("product added successfully", new HttpHeaders(), HttpStatus.OK);
		
	}

	// Get Particular Employee Data
	@GetMapping("/GetProduct/{id}")
	private ResponseEntity<Product> getProduct(@PathVariable("id") int id) {
		Product e = serviceobj.getProductById(id);
			return new ResponseEntity<Product>(e, new HttpHeaders(), HttpStatus.OK);
		
	}

	// Get All Employees Data
	@GetMapping("/AllProducts")
	private ResponseEntity<List<Product>> getAllProducts() {
		List<Product> prodlist = serviceobj.getAllProducts();
		return new ResponseEntity<List<Product>>(prodlist, new HttpHeaders(), HttpStatus.OK);

	}

	// Updating Employee data
	@PutMapping("/Updateproduct")
	public ResponseEntity<String> updateProduct(@RequestBody Product p) {
		Product e = serviceobj.updateProduct(p);
		
			return new ResponseEntity<String>("product updated successfully", new HttpHeaders(), HttpStatus.OK);
	
	}

	// Deleting Employee
	@DeleteMapping("/Deleteproduct/{id}")
	private ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
		Product e = serviceobj.deleteProduct(id);
	
			return new ResponseEntity<String>("Product deleted successfully", new HttpHeaders(), HttpStatus.OK);
		
	}

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
