import java.util.Scanner;

public class KeyboardTest {

	public static void main(String[] args) {
		Scanner sc; // reference type local variable
		sc = new Scanner(System.in);
		
		//Ű����� "quit"�� �ԷµǸ� �ݺ�����,
		//�׿��� ���� �ԷµǸ� �ݺ�����

		
		
		String inputValue;
		while(!(inputValue =sc.nextLine()).equals("quit")){
			System.out.println(inputValue + "�� �Է��߽��ϴ�.");
		}
			
		
				
		}
		
			
		
		
	}


