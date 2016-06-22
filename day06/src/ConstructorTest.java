class Rectangle{
	int result;
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
		result = width*height;
	}
	public void print(){
		System.out.println("결과: 가로" + width + "," + "세로" + height + "인 사각형의 면적은" + result + "입니다.");
	}


}





public class ConstructorTest {

	public static void main(String[] args) {
		Rectangle r1;
		r1 = new Rectangle(3,4); // 가로3, 세로4인 직사각형
		r1.makeArea(); // 사각형 객체의 면적을 계산한가
		r1.print(); // 사각형의 정보를 출력한다. 결과: 가로3, 세로4인 사각형의 면적은 12입니다.

		Rectangle r2;
		r2 = new Rectangle(5); //가로세로가 5인 정사각형 객체
		r2.makeArea();
		r2.print(); // 결과 : 가로5, 세로5 인 사각형의 면적은 25입니다.

	}

}
