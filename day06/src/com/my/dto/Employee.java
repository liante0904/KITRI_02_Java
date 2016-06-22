package com.my.dto;
import java.util.Date;

/**
 * 사원객체모델링
 * 1)객체의 속성,기능을 나열
 * 2)클래스화
 * 3)클래스를 이용하여 객체생성및 사용
 * @author Administrator
 * 
 * 1)사원의 속성, 기능을 나열
 * 사번, 이름, 전화번호, 입사일자, 급여
 * 업무를 수행한다, 회의한다, 월급을 받는다....
 */


public class Employee {
	private String no;
	private String name;
	private String phone;
	private Date hire;
	int salary;
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
	public  void work(){
		System.out.print(this.no + "사원이 ");
		System.out.println("일한다");
	}
	public void meeting(){
		System.out.print(this.no + "사원이 ");
		System.out.println("회의한다");
	}
	public void pay(){
		System.out.println("월급" + salary+ "월급을 받는다");
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
