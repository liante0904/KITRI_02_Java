
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1; // 참조형 지역변수
		e1 = new Employee();
		e1.no = "1000";
		e1.name= "첫번째";
		e1.salary= 12000;
		e1.meeting();
		
		Employee e2;
		e2 = new Employee();
		e2.no="1001";
		e2.name="두번째";
		e2.salary=10000;
		e2.work();

		Employee e3;
		e3 = e1;
		e3.name="세번째";
		//System.out.println(e3.name);
		//System.out.println(e1.name);
		e3.work();
	
		Employee e4;
		e4 = new Employee("1004", "네번째", null, 25000);
		System.out.println(e4.no+ ":" + e4.name + "," + e4.salary);

		
	
	}

}
