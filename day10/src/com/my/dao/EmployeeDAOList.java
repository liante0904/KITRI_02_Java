package com.my.dao;


import java.util.ArrayList;
import java.util.List;

import com.my.dto.Employee;
import com.my.exception.AddException;
import com.my.exception.DuplicateKeyException;
public class EmployeeDAOList implements EmployeeDAOInterface{	
	private List<Employee> employees;//사원저장소
	private int totalCnt; //총사원수
	public EmployeeDAOList(){
		this(5);
	}
	public EmployeeDAOList(int size){
		employees = new ArrayList<Employee>(size);
		//employees = new ArrayList<Employee>(size);		
	}
	public void add(Employee e) throws AddException{		
		for(Employee e1: employees){		// 향상된 for문
			if(e1.getNo().equals(e.getNo())){ 
				throw new DuplicateKeyException("이미 존재하는 사번입니다");
			}
			
		}
		/*if(selectByNo(e.getNo()) != null){
			throw new DuplicateKeyException("이미 존재하는 사번입니다");
		}*/
		employees.add(e);
	}

	public List<Employee> selectAll(){		
		if(employees.size() == 0){
			return null;
		}
		return employees;		
	}

	public Employee selectByNo(String no){
		for(Employee e: employees){
			if(e.getNo().equals(no)){
				return e;
			}
		}
		return null;
	}
	public List<Employee> selectByName(String name){
		List<Employee> list = new ArrayList<Employee>();
		for(Employee e: employees){
			if(e.getName().equals(name)){
				list.add( e );
			}
		}
		if(list.size()== 0){
			return null;
		}else{
			return list;
		}
	}
	public boolean delete(String no){
		for(int i=0; i<employees.size(); i++){
			Employee e = employees.get(i);
			if(e.getNo().equals(no)){ 
				employees.remove(i);
				return true;
			}
		}
		return false;
	}
}