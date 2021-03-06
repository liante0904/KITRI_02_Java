package com.my.dao;

import com.my.dto.Employee;
import com.my.exception.AddException;
import com.my.exception.DuplicatekeyException;
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
	 * 인자로 전달된 사원객체의 사번과 이미 저장된 사원들의 사번이 중복되는 경우 
	 * "이미 존재하는 사번입니다. " 상세메세지를 갖는 DuplicateKeyException을 발생시킨다.
	 * @param e 저장소에 저장할 사원객체
	 * @throws DuplicatekeyException 
	 */
	public void add(Employee e) throws AddException, DuplicatekeyException{
		for(int i=0; i< totalCnt; i++){
			String eNo = employees[i].getNo();
			if(e.getNo().equals(eNo)){
				throw new DuplicatekeyException("이미 존재하는 사번입니다");
			}
		}
		/*	if(selectByNo(e.getNo())!=null){
			throw new DuplicatekeyException("이미 존재하는 사번입니다.");
		} 
		 */

		/*		if(totalCnt == employees.length){
			System.out.println("저장소가 꽉찼습니다.");
			return;
		}*/

		/*
		this.employees[totalCnt]=e;
		totalCnt++;
		 */
		try{
			//this.employees[totalCnt++]= e; //bad code
			this.employees[totalCnt]=e;
			totalCnt++;
		}
		catch(ArrayIndexOutOfBoundsException ex){
			//System.out.println("저장소가 꽉찼습니다. 현재 사원수 : " + totalCnt);
			throw new AddException("저장소가 꽉찼습니다. 현재 사원수 : " + totalCnt);
		}
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
