package com.my.dto;
class Shape{
	double area;
	double circum;
	void makeArea(){
		System.out.println("Shape의 makeArea()");
	}
	

	public String toString(){
		return "도형입니다.";
	}

}
class Circle extends Shape{
	int radius; //반지름
	// double area; // 원의 면적

	Circle(int radius){
		this.radius = radius;

	}
	void makeArea(){
		System.out.println("Circle의 makeArea()");
		area = Math.PI * Math.pow(radius, 2); // 파이 * 반지름 2제곱
	}
	void print(){
		System.out.println("반지름이 " +radius+ "인 원의 면적은" +area+ "입니다.");
	}
}

class Rectangle extends Shape{
	//int result;
	//double area;
	int width, height;

	Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}

	Rectangle(int width){
		this.width=width;
		this.height=width;
	}

	void makeArea(){
		area = width*height;
	}
	public void print(){
		System.out.println("결과: 가로" + width + "," + "세로" + height + "인 사각형의 면적은" + area + "입니다.");
	}


}

public class ShapeTest {

	public static void main(String[] args) {
		Circle c1 =	new Circle(5); // 반지름이 5인 원객체
		c1.makeArea(); // 원객체 면적 계산하기
		c1.print();
	//upcasting : 하위클래스 타입의 객체 참조 변수를 상위 클래스 타입의 참조변수에 대입가능
		Shape s1 = c1; // new shape();
		//System.out.println(s1.radius);
		//c1.radius; c1.area;
	
		
		//downcasting
		Circle c2;
		c2 =(Circle)s1;  // 강제 형변환
		
		s1.makeArea();
		
		Shape[] arr = new Shape[3];
		arr[0] = new Shape();
		arr[1] = new Circle(10);
		arr[2] = new Rectangle(20, 30);
		for(int i =0; i<arr.length; i++){
			arr[i].makeArea();
		}
		
		test(new Shape());
		test(new Circle(100));
		test(new Rectangle(200, 300));
		
		test1(new Object());
		test1(new String("hello"));
		test1(new StringBuffer("hello"));
		test1(new Shape());
		test1(new Circle(100));
		test1(new Rectangle(200,300));
		
		
		}
	public static void test(Shape s){
		s.makeArea();
	}
	public static void test1(Object o){
		String info = o.toString();
		System.out.println(info);
	}
		
}





