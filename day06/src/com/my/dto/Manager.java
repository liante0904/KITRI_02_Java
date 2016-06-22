package com.my.dto;

public class Manager extends Employee {
	private int comm;
	public Manager(){
		//super(); 가 자동호출 됨
	}
	public Manager(String no, String name, String phone, int salary, int comm){
		//setNo(no); setName(name); setPhone(phone); setSalary(salary);
		super(no, name, phone, salary);
		this.comm = comm;
	}
	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}
	public void pay() {
		System.out.println("관리자 월급" + (getSalary() + comm) + "을 받는다.");
		
	}
}
