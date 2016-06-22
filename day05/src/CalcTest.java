
public class CalcTest {

	public static void main(String[] args) {
		Calc c = new Calc();
		int result;
		result = c.plus(3, 4); 		// 7
		System.out.println("계산 값은 " + result + "입니다."); // 7
		 
		double result1;
		result1 = c.plus1(3.5, 4.7);	// 8.2
		System.out.println("계산 값은 " + result1 + "입니다."); 
		
	}

}
