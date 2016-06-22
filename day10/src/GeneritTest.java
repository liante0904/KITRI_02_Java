

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class GeneritTest {
	public static void test(Collection<Integer> c){ //저장될 자료형 타입을 지정한다.
		c.add(1);
		// c.add("hello"); //Integer타입으로 generic을 지정했기 때문에 error가 발생한다.
		//c.add(1.11);
		
		for(Object 	obj:		 c){ //향상된 for문
			System.out.print(obj + ", ");
		}
	}
	public static void main(String[] args) {
		test( new ArrayList<Integer>()		);
		test( new HashSet<Integer>()		);
	}

}
