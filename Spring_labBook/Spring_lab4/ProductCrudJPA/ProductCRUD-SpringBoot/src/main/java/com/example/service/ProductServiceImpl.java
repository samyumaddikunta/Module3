package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Product;
import com.example.dao.ProductDaoImpl;

@Service
@Transactional
public class ProductServiceImpl implements ProductService 
{
@Autowired
ProductDaoImpl dao;

/* (non-Javadoc)
 * @see com.example.service.EmployeeService#EmployeeCreation(com.example.entity.Employee)
 */
@Override
public Product insertProduct(Product p) {
	return dao.insertProduct(p);
}

/* (non-Javadoc)
 * @see com.example.service.EmployeeService#getEmployeeById(int)
 */
@Override
public Product getProductById(int id) 
{
return dao.getProductById(id);
}

/* (non-Javadoc)
 * @see com.example.service.EmployeeService#getAllEmployee()
 */
@Override
public List<Product> getAllProducts() 
{
return dao.getAllProducts();
}

/* (non-Javadoc)
 * @see com.example.service.EmployeeService#delete(int)
 */
@Override
public Product deleteProduct(int id) 
{
	return dao.deleteById(id);
}

/* (non-Javadoc)
 * @see com.example.service.EmployeeService#UpdateEmployee(com.example.entity.Employee)
 */
@Override
public Product updateProduct(Product p) {
	return dao.updateProduct(p);	
}

}