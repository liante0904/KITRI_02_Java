/*
 * 메서드 오버로드:
 * 메서드이름은 같고 매개변수유형 |매개변수 갯수| 순서가 다른 메서드들
 * 대표메서드 - System.out.println( )
 **/




public class Calc {

	
	
	public int plus(int a,int b){
		return a+b;
	}
	
	public double plus1(double a, double b){
		return a+b;
	}
	public int plus(int a, int b, int c){
		return a+b+c;
	}
}
