package com.my.dao;

import java.util.List;

import com.my.dto.Product;
import com.my.exception.AddException;

public interface ProductDAOInterface {
	void add(Product product) throws AddException;
	List<Product> selectAll();
	List<Product> selectByName(String name);
	Product selectByNo(String no);
	Product update(Product product);
	boolean delete(String no);
}