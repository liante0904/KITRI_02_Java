public class WhileLoop{
  public static void main(String []args){
    //1~10까지 출력하시오
   int num = 1;
    while(num <= 10){
      System.out.println(num);
      num++;
	  
	  for(int k =1; k<=10; k++){
		  System.out.print(k);

		  
	  }
    }  
    System.out.println("---------------------");
    //1~100사이의 숫자중 3의 배수를 출력하시오.
    num=1;
     while( num <= 100     ){
        if( num % 3 == 0){
         System.out.print(num+",");         
        }
        num++;
     }
     
     /*for(int z=1; z<=100; z++)
     {
    	 if(z%3 ==0){
    		 System.out.println(z);  
    		 
    		 
    		 
    	 }
     }*/
     
     for(int k =3; k<=100; k+=3)
     {System.out.print(k + ",");}

     System.out.println( );
     System.out.println("---------------------");      
     num=3;
     while( num <= 100     ){    
       System.out.print(num+",");     
        num+=3;         
     }
     System.out.println( );
     System.out.println("---------------------"); 
   
   //Fibonacci 수열값을 20개 출력하시오.
   //1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,   .......
     
     
     int a =1;
     int b =1;
     int c =0;
     int count = 0;
     System.out.println("여기부터");


	 System.out.print (a + ","   );
	 System.out.print (b  + "," );
     while(count <20){
    	 c = a+b;
    	 System.out.print (c   + "," );
    	 b= a;
    	 a = c;
    	 
    	 count++;
     }
     
     int d =0;
     
     
     c=a+b;
     d = b+c;
     b= a;
     a= c;
     
     
    		
     
     
   /*int bb, b, result, count;
   bb=0; b=1; 
   result=bb+b;
   count = 1;  
   System.out.println(count+":" + result);
   count++;

   while( count  <= 20){
     result = bb+b; 
     System.out.println(count+":" + result);
     bb = b;
     b = result;    
     count++;
   }*/

     

     
   //5팩토리얼의 값을 계산하여 출력하시오.   
   /*5!은 5*4*3*2*1 또는 1*2*3*4*5
   1)num=5;           num=1;                       
   2)num=1)*(5-1);  num=1)*2;       
   3)num=2)*(5-2);  num=2)*3;            
   4)num=3)*(5-3);  num=3)*4;
   5)num=4)*(5-4);  num=4)*5;
   */	

     
     
     
   int factorial = 5; //5팩토리얼
   num=factorial;
   count=factorial-1;
   while(count >= 1){
     System.out.print(num +"*" + count +"="); 
     num*=count; 
     System.out.println( num);
     count--;
   }
   System.out.println(factorial +"팩토리얼:" + num);

   System.out.println("@@@@@@@@@");
   int fact = 5; // 구할 팩토리얼 입력값
   count = 0;
   int result =1;
   while(fact-count != 0){
 
	   result *= (fact - count);
   count++;}
   System.out.println(fact+"팩토리얼 값은 :" + result);
	
  
   num=1;
   count=1;
   while(count <= factorial ){
     System.out.print(num +"*" + count +"="); 
     num*=count; 
     System.out.println( num);
     count++;
   }
   System.out.println(factorial +"팩토리얼:" + num);

   //1부터 10까지의 합을 구하시오.
   //1+2+3+4+5+6+7+8+9+10 : 55
   num=1;
   int sum=0;
   while( num <= 10  ){
     sum += num; 
     num++;
   }
   System.out.println( sum );

   //1부터의 숫자합이 5을 넘지않는 최대숫자를 구하시오. 결과: 2
   //                      35                                               : 7
   num=0;
   sum=0;
   while(  sum+(num+1) <= 35 ){
     num++;
     sum += num;
     System.out.println(num +":" + sum);
   }   
   System.out.println( num ); 
  }





}