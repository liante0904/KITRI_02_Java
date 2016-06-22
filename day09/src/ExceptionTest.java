import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void test(int i){
		try{int result = 99 / i;
		System.out.println("99/"+i+"="+ result);
	}catch(ArithmeticException e){
		System.out.println(i+ "으로 나눌수 없습니다.");}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("입력하세요.");
		
		int i;
		try{
			i = sc.nextInt(); // InputMismatchException		

		}catch(InputMismatchException e){
			//System.out.println("숫자를 입력하세요");
			System.out.println("숫자를 입력하세요");
			i = 1;
		}
		test( i );
	}
}
