
public class ArrayTest {
	public static void main(String[] args) {
      int score1, score2, score3, score4, score5;
      score1=10; score2=90; score3=0; score4=1; score5=35;
      double avg = 
    		  (score1+score2+score3+score4+score5)/5.0;
      System.out.println(avg);

      int[]score; //int배열타입의 변수선언
      score = new int[5]; //배열생성
      
      //0번 index부터 사용가능
      score[0]=10; score[1]=90; score[2]=0; score[3]=1; score[4]=35;
      
      avg=0.0;
      for(int index=0; index<=4; index++){
    	  avg += score[index];
      }
      avg = avg/5; // avg /= 5;
      System.out.println(avg);
      
      /*
      int[]lastDay; //배열선언
      lastDay = new int[12];//배열생성
      lastDay[0]=31; //1월의 마지막일자 //index값대입 
      lastDay[1]=29; //2    
      lastDay[2]=31;
      lastDay[3]=30;
      :
      */
      //배열초기화 : 선언,생성,대입을 한번에 할 수 있다.
      //int[]lastDay = new int[12];선언,생성
      int[]lastDay = 
    	  {31,29,31,30, 31, 30,31,31, 30,31,30,31};//선언,생성,대입
      System.out.println("4월의 마지막일자:" + lastDay[3]);
      
      //lastDay={31, 28, 31};
      lastDay = new int[]{31, 28, 31};//초기화된 배열 재초기화방법
      //System.out.println("4월의 마지막일자:" + lastDay[3]); //???
     
      
      //2차원배열
      char [][]alpa; //배열변수 선언
      alpa = new char[3][4];
      //alpa[0][0] = 'A'; alpa[0][1]='B'; alpa[0][2]='C'; alpa[0][3]='D';
                        //(char)('A'+1)     (char)('A'+2)
      /*
      for(int index=0; index<4; index++){
    	  alpa[0][index] = (char)('A'+index);
    	  System.out.print(alpa[0][index]);
      }
      System.out.println();
       */
      /*ABCD
       *EFGH
       *IJKL 
       */
      char c = 'A';//시작문자
      int rowLength = alpa.length;//행길이
      int colLength = alpa[0].length;//열길이      
      int index = 0;//문자증가치      
      for(int row=0, col=0; index<rowLength*colLength; index++){
    	  alpa[row][col] = (char)(c+index);
    	  System.out.print(alpa[row][col]);
    	  col++;
    	  if( col % colLength == 0){ //col==4||col==8
    		  System.out.println();
    		  row++;
    		  col = 0;    		 
    	  }
      }
      System.out.println();
      
      index = 0;
      for(int row=0; row<rowLength; row++){
      	for(int col=0; col<colLength; col++){
      		alpa[row][col] = (char)(c+index);
      		System.out.print(alpa[row][col]);
      		index++;
      	}
      	System.out.println();
      }
      System.out.println("----------------------------");
      
      /*
       * A
       * BC
       * DEF
       * GHIJ
       * KLMNO
       */
       c = 'A';
       char[][]tri; //선언
       tri = new char[5][]; //생성 
       /*tri[0] = new char[1];
       tri[1] = new char[2];
       tri[2] = new char[3];
       tri[3] = new char[4];
       tri[4] = new char[5];*/
       //행별 열지정
       for(index=0; index<tri.length; index++){
    	   tri[index] = new char[index+1];
       }       
       //행열에 값대입
       for(int row =0; row< tri.length; row++){
    	   for(index=0; index< tri[row].length ;index++){
    		   tri[row][index] = c++;//(char)(c+index+1 );
    	   }
       }       
       //행열값 출력
       for(int row =0; row< tri.length; row++){
    	   for(index=0; index< tri[row].length ;index++){
    		   System.out.print(tri[row][index]);
    	   }
    	   System.out.println();
       }
       
      // tri[0][0]=c;
      // c++;
/*       tri[0][0] = c++;       
       for(index=0; index< 2 ;index++){
    	   tri[1][index] = c++;//(char)(c+index+1 );
       }      
       for(index=0; index<3; index++){
    	   tri[2][index] = c++;//(char)(c+ index+3 );
       }       
       for(index=0; index<4; index++){
    	   tri[3][index] = c++;//(char)(c+ index+6 );
       }*/
       
       
	}

}