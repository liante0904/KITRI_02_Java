public class Datatype{
  public static void main(String[] args) {
 
	  //  정수형 데이터 타입 
	  byte b;
      short s;
      int i;
      long l;

      // 실수형 데이터 타입 
      float f;
      double d;

      // 문자형 데이터 타입, 논리형 데이터 타입 
      char c;
      boolean bo;

      b = 1;
      System.out.println( b ); // 1
      b = 127;
      // b = 128;
      // 데이터 타입의 범위보다 큰 데이터 이므로 대입할수 없다.


      c = 'A';
      System.out.println( c );

      c = 65;
      System.out.println( c );

      // f = 1.2;
      f = 1.2F;
      System.out.println( f );
      // 실수형 문자타입의 default가 double이므로
      // float을 사용하려면 f를 붙여주어야 한다.


      l = 9999999999999999L;
      // 정수형 문자타입의 default가 int이므로
      // 더 큰 문자타입을 사용하려면 L을 붙여준다.

      bo = true;
      bo = false;
      // 불린은 true, false 외에 다른 것은 사용할 수 없다.



        // 자동 형변환 : small type -> large type

        s = b; // 127
        i = s;
        l =  i;
        f = l ;
        d = f;
        System.out.println( d );

        // 강제 형변환 : large type -> small type

        d = 127.8;
        f = (float) d; //127.8
        i = (int) f;
        System.out.println( i ); // 127

        c = 'a';
        i = c; // 자동 형변환


        System.out.println( i );
        System.out.println( (char)i ); // 강제 형변환

        //boolean 자료형은 형변환이 불가능!


      }
    }
