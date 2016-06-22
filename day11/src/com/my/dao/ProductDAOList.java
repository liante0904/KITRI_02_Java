package com.my.dao;

import java.util.ArrayList;
import java.util.List;
import com.my.dto.Product;
import com.my.exception.AddException;
import com.my.exception.DuplicateKeyException;

public class ProductDAOList implements ProductDAOInterface {
	private List<Product> products;
	public ProductDAOList() {
		products = new ArrayList<Product>();
	}
	@Override
	public void add(Product product) throws AddException { //관리자
		if( products.contains(product) ){
			throw new DuplicateKeyException("이미 존재하는 상품입니다");
		}
		products.add( product );
	}

	@Override
	public List<Product> selectAll() { //사용자 고객
		
		return null;
	}

	@Override
	public List<Product> selectByName(String name) { //사용자 고객
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product selectByNo(String no) { //사용자 고객
		Product p = new Product(); p.setProd_no(no);
		int index = products.indexOf(p);
		if( index != -1){
			return products.get(index);
		}
		return null;
	}

	@Override
	public Product update(Product product) { //관리자
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String no) {
		// TODO Auto-generated method stub
		return false;
	}

}
