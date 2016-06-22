package com.my.dao;
import com.my.dto.Employee;

public class EmployeeDAO {
	//사원 저장소
	private Employee[] employees;
	private int totalCnt; // 총사원수
	
	public EmployeeDAO(){
		//employees =new Employee[5];
		this(5);
	}
	public EmployeeDAO(int size){
		employees = new Employee[size];	 // 사원수 만큼 employee 배열 인덱스 조정 
	}
	
	/**
	 * 인자로 전달된 사원객체를 저장소에 저장한다.
	 * 총 사원수를 1증가한다
	 * @param e 저장소에 저장할 사원객체
	 * */
	public void add(Employee e){ 	// 사원 추가 메소드 그 숫자는 totalCnt만큼이며, add메소드의 인자는 
		employees[totalCnt] = e;	// 사원의 정보를 의미한다.
		totalCnt++;
		}
		
					
	

	/*
	 * 총사원을 반환한다.
	 *@return 저장소에 저장되어있는 사원객체들을 반환한다.
	 *저장되어있는 사원이 없을경우 null값을 반환한다*/
	public Employee[] selectAll(){
		if(totalCnt == 0){
			return null;
		}	
		Employee[] cnt = new Employee[totalCnt];
		/*for(int i=0; i<totalCnt; i++){
			cnt[i] = employees[i];
		*/
		System.arraycopy(employees, 0, cnt, 0, totalCnt);
			return cnt;

		}
	
	
	
	/* 사번으로 저장소의 사원을 검색하여 반환한다.
	 * @param no 사번
	 * @return 사원객체. 사번에 해당하는 사원이 없으면 null을 반환한다
	 * */
	public Employee selectByNo(String no){
		for(int cnt=0; cnt<totalCnt; cnt++){
			if(no.equals(employees[cnt].getNo())){
				return employees[cnt];
			}
		}
		return null;
	}
	public Employee[] selectByName(String name){
		return null;
	}
	public void delect(String no){
		
	}
}
