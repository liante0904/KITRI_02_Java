public class ZodiacIf {
  public static void main(String[] args) {
	  int year = 2016;
	    //년도를 12로 나눈 나머지가 0이면 원숭이, 1이면 닭, 2면 개, 3-돼지
	    //4-쥐, 5-소, 6-호랑이, 7-토끼,
	    //8-용, 9-뱀, 10-말,  11-양

	    String sign;  //동물이름
	    int mod = year % 12;

	    if (mod==0){
	     sign = "원숭이";
	    }else if (mod==1){
	     sign = "닭";
	    }else if (mod==2){
	     sign = "개";
	    }else if (mod==3){
	     sign = "돼지";
	    }else if (mod==4){
	     sign = "쥐";
	    }else if (mod==5){
	     sign = "소";
	    }else if (mod==6){
	     sign = "호랑이";
	    }else if (mod==7){
	     sign = "토끼";
	    }else if (mod==8){
	     sign = "용";
	    }else if (mod==9){
	     sign = "뱀";
	    }else if (mod==10){
	     sign = "말";
	    }else {
	     sign = "양";
	    }
	    System.out.println(year+"년도는 " + sign +"의 해입니다.");
  



switch (mod) {

    case 0: sign = "원숭";
    break;

    case 1: sign = "닭 ";
    break;

    case 2: sign = "개 ";
    break;

    case 3: sign = "돼지 ";
    break;

    case 4: sign = "쥐 ";
    break;

    case 5: sign = "소  ";
    break;

    case 6: sign = "호랑이 ";
    break;

    case 7: sign = "토끼 ";
    break;

    case 8: sign = "용 ";
    break;

    case 9: sign = "뱀 ";
    break;

    case 10: sign = "말 ";
    break;

    case 11: sign = "양 ";
    break;




}
System.out.println(year + "년도는 " + sign + "의 해입니다.");

  }
}
