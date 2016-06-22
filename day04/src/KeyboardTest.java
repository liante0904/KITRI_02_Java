import java.util.Scanner;

public class KeyboardTest {

	public static void main(String[] args) {
		Scanner sc; // reference type local variable
		sc = new Scanner(System.in);
		
		//키보드로 "quit"이 입력되면 반복중지,
		//그외의 값이 입력되면 반복실행

		
		
		String inputValue;
		while(!(inputValue =sc.nextLine()).equals("quit")){
			System.out.println(inputValue + "를 입력했습니다.");
		}
			
		
				
		}
		
			
		
		
	}


