package com.my.dto;
public class Manager extends Employee {
	private int comm;
	public Manager(){
		//super();가 자동호출됨
	}
	public Manager(String no, String name, String phone, int salary){
		//setNo(no); setName(name); setPhone(phone); setSalary(salary);
		super(no, name, phone, salary);
	}
	public Manager(String no, String name, String phone, 
			       int salary, int comm){
		super(no, name, phone, salary);
		this.comm = comm;
	}
	public String toString(){
		return "관리자:" + getNo() + ":" + getName()+":" + getSalary()+":" + comm;
	}
	public void pay(){
		System.out.println("관리자월급 " + (getSalary()+comm)+"을 받는다");
	}
	public int getComm() {	return comm;	}
	public void setComm(int comm) {	this.comm = comm;}	
}
