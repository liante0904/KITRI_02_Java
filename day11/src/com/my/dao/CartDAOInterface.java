package com.my.dao;

import java.util.Map;

import com.my.dto.Product;

public interface CartDAOInterface {
	public void add(Product product);
	public Map<Product, Integer> selectAll();
}
