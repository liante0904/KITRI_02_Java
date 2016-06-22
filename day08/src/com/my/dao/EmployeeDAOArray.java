package com.my.dao;

import com.my.dto.Employee;
public class EmployeeDAOArray implements EmployeeDAOInterface{	
	private Employee[]employees;//사원저장소
	private int totalCnt; //총사원수
	public EmployeeDAOArray(){
		//employees = new Employee[5];
		this(5);
	}
	public EmployeeDAOArray(int size){
		employees = new Employee[size];
	}
	
	/**
	 * 인자로 전달된 사원객체를 저장소에 저장한다.
	 * 총사원수를 1증가한다
	 * @param e 저장소에 저장할 사원객체
	 */
	public void add(Employee e){
		this.employees[totalCnt]=e;
		totalCnt++;
	}
	/**
	 * 총사원을 반환한다.
	 * @return 저장소에 저장되어있는 사원객체들을 반환한다.
	 * 저장되어있는 사원이 없을 경우 null값을 반환한다
	 */
	public Employee[] selectAll(){		
		if(totalCnt == 0){
			return null;
		}
		Employee[] list = new Employee[totalCnt];
/*		for(int i=0; i<list.length; i++){
			list[i] = employees[i];
		}*/
		System.arraycopy(employees, 0, list, 0, totalCnt);
		return list;		
	}
	/**
	 * 사번으로 저장소의 사원을 검색하여 반환한다.
	 * @param no 사번
	 * @return 사원객체. 사번에 해당하는 사원이 없으면 null을 반환한다
	 */
	public Employee selectByNo(String no){
		for(int i=0; i< totalCnt   ; i++){
			String eNo = employees[i].getNo();
			if(no.equals(eNo)){ //if(no==eNo)
				return employees[i];
			}
		}
		return null;
	}
/*	public Employee[] selectByName(String name){
		
	}
	public void delete(String no){
		
	}*/
	
}
