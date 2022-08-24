package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository


public class ProductDao {
	
	@Autowired
	SessionFactory sf;      //DI from configuration file with help of LocalSessionFactoryBean
	
	
	public int updateProduct(Product product) {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Product p = session.get(Product.class, product.getPid());
		if(p==null) {
			return 0;
			
		}else {
			tran.begin();
			   p.setPname(product.getPname());
			   p.setPrice(product.getPrice());
			   p.setUrl(product.getUrl());
			   session.update(p);
			tran.commit();
			return 1;
			
		}
	}
	
	
	public Product searchProductById(int pid) {
		Session session = sf.openSession();
		Product p = session.get(Product.class, pid);
		return p;
	}
	


}
