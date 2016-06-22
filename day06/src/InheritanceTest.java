import com.my.dto.Employee;
import com.my.dto.Manager; // import com.my.dto.*;

public class InheritanceTest {

	public static void main(String[] args) {
		Employee e1;
		e1 = new Employee();	 e1.setNo("E001"); e1.work(); e1.setSalary(1000);
		Manager m1;
		m1 = new Manager();		m1.setNo("M001"); m1.work(); m1.setSalary(2000);
		// 상속받은 메소드
		// m1.phone = "010"; // 부모의 private필드는 하위 클래스에서 접근할수 없다.


		Employee e2 = new Employee("E002", "두번째사원", "011", 1100);
		Manager m2 = new Manager("M002", "두번째관리자", "012", 2100, 100);
		e2.pay();
		m2.pay();
	}

}
