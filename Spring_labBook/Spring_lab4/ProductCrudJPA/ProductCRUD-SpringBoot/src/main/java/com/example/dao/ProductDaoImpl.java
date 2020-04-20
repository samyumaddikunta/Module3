package com.example.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Product;
@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext	
	 EntityManager em;
	
	@Override
	public Product insertProduct(Product p) {
		// TODO Auto-generated method stub
		Product e=em.merge(p);
		return e;
	}
	
	@Override
	public Product getProductById(int id) {
		
		return em.find(Product.class,id);
	}
	
	@Override
	public List<Product> getAllProducts() {
		Query q=em.createQuery("select m from Product m");
		List<Product> prodlist=q.getResultList();
		return prodlist;
	}
	
	@Override
	public Product updateProduct(Product p) {
		Product e=em.find(Product.class,p.getId());
		if(e!=null)
		{
			e.setName(p.getName());
			e.setPrice(p.getPrice());
		}
		return e;
			
	}
	@Override	
	public Product deleteById(int id) {
		Product e=em.find(Product.class,id);
		if(e!=null)
			{em.remove(e);
			}
        return e;
	}
}
