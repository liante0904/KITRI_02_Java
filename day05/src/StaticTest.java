class A{
	static int i;
	static int si;
	static void m(){
		System.out.println("in m: i=" + i+", si=" + si);
	}
	static void sm(){
		System.out.println("in sm: i=" + i+", si=" + si);
	}
}
public class StaticTest {
	public static void main(String[] args) {
		System.out.println(A.si);
		System.out.println(A.i);
		A a1 = new A();
		A a2 = new A();
		a1.i++;
		a1.si++;
		
		a2.i++;
		a2.si++;
		
		System.out.println(A.si);
		System.out.println(a1.si);
		
		System.out.println(a1.i);
		System.out.println(a2.i);
		
		A.sm();
		A.m();
		
		a1.sm();
		a1.m();
	}
}
