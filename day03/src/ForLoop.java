public class ForLoop{
 public static void main(String[] args) {


      //1~10까지 출력하시오.
      for (int num = 1; num <= 10; num++ ) {
        System.out.println(num + ",");
      }

      //1~100사이의 숫자중 3의 배수를 출력하시오
      System.out.println();
      System.out.print("========================");
      System.out.println();

      for (int num = 1; num <= 100 ;  num++ ) {
        if (num % 3 == 0) {
          System.out.print(num + ",");
}
}
      System.out.println();
      System.out.print("========================");
      System.out.println();


      //1~100사이의 숫자중 3의 배수를 출력하시오
          for (int num = 0; num <= 100; num+=3 ) {
            System.out.print(num + ",");
          }

      System.out.println();
      System.out.print("========================");
      System.out.println();


      //Fibonacci 수열 값을 20개 출력하시오.
      for (int a=1, b=1, c=0, count=1; count <= 20 ; count++ ) {
        System.out.print(a + ",");
        a=b+c; c=b; b=a;
      }

      System.out.println();
      System.out.print("========================");
      System.out.println();

      // 1부터 10까지의 합을 구하시오.
      // 1+2+3+4+5+6+7+8+9+10
      int sum=0;
      for (int num=1; num <=10; num++ ) {

        sum += num;
        }
        System.out.print(sum);


    }
  }
