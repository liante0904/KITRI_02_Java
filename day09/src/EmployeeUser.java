import java.util.Scanner;

import com.my.dao.EmployeeDAOArray;
import com.my.dao.EmployeeDAOInterface;
import com.my.dto.Employee;
import com.my.dto.Manager;
import com.my.exception.AddException;
import com.my.exception.DuplicatekeyException;

public class EmployeeUser {
	private EmployeeDAOInterface dao;
	static private Scanner sc = new Scanner(System.in);
	public EmployeeUser(){
		dao = new EmployeeDAOArray();
	}
	public void register() {
		System.out.println(">>사원등록작업<<");
		String gubun;
		//TODO 입력받은 gubun값이 1이거나 2일때만 반복을 빠져나온다.
		do{
			System.out.println("사원종류선택[1-사원, 2-관리자]:");
			gubun= sc.nextLine();
		}while(!gubun.equals("1") && !gubun.equals("2") );
		
		System.out.print("사번:");
		String no = sc.nextLine();
		
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.print("급여:");
		int sal = Integer.parseInt(sc.nextLine());
		 
		try{
		if(gubun.equals("1")){
			dao.add(new Employee(no, name, null, sal));
		}else{
			//TODO 관리자인 경우 수당을 입력받아서 관리자객체생성하고 관리자를 저장소에 저장한다
			System.out.print("수당:");
			int comm = Integer.parseInt(sc.nextLine());
			dao.add(new Manager(no, name, null, sal, comm));				
		}
		System.out.println("사원등록 성공");		}
		catch(DuplicatekeyException ex){
			System.out.println(ex.getMessage());
		}
		catch(AddException ex){
			System.out.println(ex.getMessage());
		}
	}
	public void findAll(){
		System.out.println(">>사원전체 검색작업<<");
		Employee[] arr = dao.selectAll();
		if(arr == null){
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		for(int i=0; i<arr.length; i++){
			/*println(Object x ){
			 *     String.Value(x);
			 *}
			 *
			 *
			 *valueOf(Object obj){
			 *    obj.toString(  );
			 *}
			 */
			System.out.println(arr[i]); //TODO 일반사원인 경우는 "일반사원:사번값:이름값:급여값"이 출력되고
			                            //관리자인 경우는 "관리자:사번값:이름값:급여값:수당값"이 출력되도록 한다.
			                            //현재코드는 변경하지 않는다
		}
	}
	
	public void findByNo(){
		System.out.println(">>사번으로 사원 검색작업<<");
		System.out.print("사번:");
		String no = sc.nextLine();		
		Employee e = dao.selectByNo(no);
		if(e == null){
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		System.out.println(e); //TODO 일반사원인 경우는 "일반사원:사번값:이름값:급여값"이 출력되고
        //관리자인 경우는 "관리자:사번값:이름값:급여값:수당값"이 출력되도록 한다.
        //현재코드는 변경하지 않는다
	}
	public static void main(String[] args) {
		EmployeeUser user = new EmployeeUser();
		System.out.println("사원관리프로그램");
		String job;
		//TODO:아래작업을 반복수행으로 완성하시오. 단, "9"번을 선택한 경우 반복을 빠져나온다.
		do{
			System.out.println("1:사원등록, 2:전체사원검색, 3:사번으로 사원검색, 9-종료");
			System.out.print("작업을 선택하시오.:");
			job = sc.nextLine();
			switch(job){
			case "1":
				user.register();
				break;
			case "2":
				user.findAll();
				break;
			case "3":
				user.findByNo();
			}
		}while(!job.equals("9"));
		
	}
}
