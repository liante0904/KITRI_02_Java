package com.my.dto;
import java.util.Date;
public class Employee { //컴파일시에 extends Object가 추가됨
	private String no;
	private String name;
	private String  phone; //010
	private Date hire;
	private int salary;
	public Employee(){
		System.out.println("매개변수 없는 생성자 호출됨");
	}
	public Employee(String n, String nm, String p, int s){
		System.out.println("생성자호출됨");
		no = n;
		name = nm;
		phone = p;
		salary = s;
	}
	public String toString(){
		return "일반사원:" + no + ":" + name+":" + salary;
	}
	public void work( ){
		System.out.print(this.no+"사원이 " );  
		System.out.println("일한다");  
	}  
	public void meeting( ){
		System.out.print(this.no+"사원이 " );
		System.out.println("회의한다");  
	}

	public void pay(){
		System.out.println("월급 " + salary +"을 받는다");	  
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getHire() {
		return hire;
	}
	public void setHire(Date hire) {
		this.hire = hire;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}



}
