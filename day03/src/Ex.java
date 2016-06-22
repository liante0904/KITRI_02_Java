
public class Ex {

	public static void main(String[] args) {
		// 1~100중 3의 배수 합을 구하시오
		
		int num;
		int sum=0;
		for(num = 1; num <= 100; num++){
			if(num % 3 ==0){
				sum += num; //sum = sum + num;
			}
		}
		System.out.println(sum);
		char star='*';
		for(int row=1; row<=5; row++){
			for(int i=1; i<=row; i++){
				System.out.print(star);		
				}
			System.out.println();	}
	}
}


	


