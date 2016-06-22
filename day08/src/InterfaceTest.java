interface A{ // 인터페이스 선언
		void a(); // public abstract void a();과 같음
}
interface B{
	void b();
}

interface C extends A{ // 인터페이스와 클래스 상속
	void c();
}
class D implements A{ // 인터페이스 구현
	public void a(){
		System.out.println("D의 a()");
	}
}
class E implements A, B{
	public void a(){
		System.out.println("E의 a()");
	}
	
	public void b(){
		System.out.println("E의 a()");
	}
}

class F implements C{
	public void c(){
		System.out.println("F의 c()");
	}
	public void a(){
		System.out.println("F의 a()");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		A a; //a=new A(); 직접 객체생성 못한다. 인터페이스 이기때문
		a = new D(); //D는 구체화된 객체이기 때문에 가능하다. 상위 인터페이스로 업캐스팅 한 상태
		a.a(); //D의 a() 호출
		a = new E(); //성공 E의 a()
		a.a(); //a.b();는 실패
		a = new F(); //F의 상위는 C C의 상위는 A
		a.a(); //a.c(); C는 구체화된 객체가 아니기 때문에 실행 실패
	}

}
