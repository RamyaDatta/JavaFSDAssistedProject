package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service


public class ProductService {
	@Autowired
	ProductDao productDao;
	
	
	public String updateProduct(Product product) {
		if(productDao.updateProduct(product)>0) {
			return "Record updated successfully";
		}else {
			return "Record didnt update";
		}
	}
	
	public String searchProductById(int pid) {
		Product p=productDao.searchProductById(pid);
		if(p==null) {
			return "Record not present";
		}else {
			return p.toString();
		}
	}


}
