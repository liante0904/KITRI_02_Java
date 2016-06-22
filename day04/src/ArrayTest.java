import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//정수 6개가 저장될 배열선언 및 생성.
		// 변수명 : arr

		int []arr = new int[6];
		 

		//중복 되지 않는,임의의 숫자를 발생해서 arr의 각 index에 대입
		//임의의 숫자범위 : 1<= r <= 45

		for(int index =0; index <6; index++ ){
			arr[index] = (int)(Math.random()* 45)+ 1;

			for(int bindex=0; bindex<index; bindex++){
				if(arr[bindex] == arr[index]){
					index--;
					break;
				}
			}


		}
		for(int index =0; index <6; index++ ){
	//		System.out.println(arr[index]);
		}
		// -정렬 : SELECTION SORT 오름 차순 정렬
		/*
		for(int i=1; i<= arr.length-1; i++){
			if(	arr[0] > arr[i]){
				int temp = arr[0];
				arr[0]= arr[i];
				arr[i]= temp;
			}	
		 */
		int[][]arr2 = { {90,100,35}, //db, java, web
				{88,93,22}, 
				{77,91,45}, 
				{66,83,93},
				{55,72,92}
		};

		// 각 학생별 총점과 평균을 계산하시오. 평균은 정확한 실수값
		/*
		 * 1번학생 : 총점 225, 평균 \ 75.0
		 * 2번학생 : 총점 	 ,	 	=
		 *  
		 *  DB과목 평균 =
		 *  JAVA과목 평균 =
		 *  WEB괌고 평균 =
		 *  */


		int sum = 0;


		for(int index=0; index<arr2.length; index++){
			for(int index1=0; index1<arr2[index].length; index1++){
				sum += arr2[index][index1];

			}
//			System.out.println((index+1) + "번 학생: 총점 =" + sum + ", 평균=" + (sum/3.0) );
			sum=0;

			
			
			int[][] arr3;
			arr3 = new int[3][3];
			
			
			// 1~9숫자를 행열에 순서대로 대입하시오.

			int count=1;
			for(int dex=0; dex<arr3.length; dex++){
				for(int dex1=0; dex1<arr3[0].length; dex1++){
					arr3[dex][dex1]=count;
					System.out.print(arr3[dex][dex1]);
					count++;
					}
				System.out.println();
			}

			//arr3값을 시계방향으로 90도 회전 시키시오.
			
			
			//파스칼 삼각형 만들기

			//마방진 만들기
			int num =0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("마방진 크기를 입력하세요");
			int size = sc.nextInt();
			int[][] arr6 = new int[size][size];
			
			num = 1;
			arr6[0][size/2] = num;
			
			
			
					}
				}
				
			}
			

		
	














