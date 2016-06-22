package com.my.dto;

public class Category {
	private String category_no;
	private	String categoty_name;
	public Category() {
	}
	public Category(String category_no, String categoty_name) {
		super();
		this.category_no = category_no;
		this.categoty_name = categoty_name;
	}
	public String getCategory_no() {
		return category_no;
	}
	public void setCategory_no(String category_no) {
		this.category_no = category_no;
	}
	public String getCategoty_name() {
		return categoty_name;
	}
	public void setCategoty_name(String categoty_name) {
		this.categoty_name = categoty_name;
	}
}
