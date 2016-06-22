package com.my.dao;

import java.util.HashMap;
import java.util.Map;

import com.my.dto.Product;

public class CartDAOList implements CartDAOInterface {
	private Map<Product, Integer> cart = 
			new HashMap<Product, Integer>();
	
	@Override
	public void add(Product product) {
		Integer value = cart.get(product);
		if( value == null ) {
			cart.put(product, 1);
			
		}else{ 
			//수량을 1증가해서 cart에 누적	
			value++; 
					cart.replace(product, value);
		}
		//cart.put(product, 1);
	}

	@Override
	public Map<Product, Integer> selectAll() {
		// TODO Auto-generated method stub
		return cart;
	}

}
