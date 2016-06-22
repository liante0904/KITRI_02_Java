public class Operator{
	public static void main(String[] args) {
    short a, b, c;
    a = 10;
    b = 20;
    c = (short)(a + b);
    //c=a+b; // int보다 작은 자료형은 산술연산에 참여시키면 자동 int로 형변환
    System.out.println( c );

    int x, y, z;

    x= 1;
    y= 0;
    z= 0;

    /*
    z= x/y;

    System.out.println( z );
   /*
     z = x/y; //ArithmeticException예외발생 프로그램 중지됨
     System.out.println( z ); 
     */


    z = x++ + ++y;   // x는 1이 대입되었고, 다음에 x가 사용될때 2가 된다. y는 1이 되어 대입된다. 즉 z = 1+1가 된다.
    System.out.println( z ); //2 
    System.out.println( x + " , " + y  ); // 2,1
    System.out.println( x+y + " , " + z  ); // 3,2


    //z값이 짝수/홀수판별 ==, !=, >, <, >=, <=
    String msg = z%2==0 ? "짝수" : "홀수";  //삼항연산자
    System.out.println( msg  );

    
    int ab, ac;
    ab = 10;
    ac = 3;
    
    String result = ab>ac ?  "z가 더 크다" : "z가 더 작다";
    
    System.out.println(result);
    

    //논리연산자 : &, |, !
    //x가 2의 배수이고 y가 양수이면 msg에 "2의배수",  
   //그렇지 않은 경우에는 "2의 배수도 아니고 양수도 아님"을 대입

    msg =  (x % 2 == 0) & y > 0
    ? "2의 배수" : "2의 배수도 아니고 , 양수도 아님 ";
    System.out.println( msg  );

    //논리연산자 &&와 &의 차이점
   /* 
  A &&  B : A가 false이면 B를 수행안함, 결과는 false
  A &    B : A가 false여도 B를 수행함, 결과  false
   */
   
   //논리연산자 ||와 |의 차이점
  /*
  A ||  B :  A가 true이면 B를 수행 안함, 결과는 true
  A |   B :  A가 true여도 B를 수행함,  결과는 true
  boolean a, b; a=true; b=false;
  a & b   
  */

   //비트연산자 : &, |, ^
   //x & y

  //대입연산자





int z1, z2, z3;
z1 = 5;
z2 = 10;
z3 = 7;
System.out.println( (double)(z1+z2)*z3/2  );


  }
}
