
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
	public static void test(Collection c){
		c.add("first"); 
		c.add(2); //컴파일러에 의해 c.add( new Integer(2) ); 로 바뀜
		c.add(3L); // c.add( new Long(3L) );로 바뀜
		c.add(4.0F); // c.add( new Float(4.0F) );로 바뀜
		c.add("first"); 
		c.add(true); // c.add( new Boolean(true) );로 바뀜
							// c.add( 'A' ); -> c.add( new Character('A'));로 바뀜
		System.out.println("자료수:" + c.size());
		System.out.println(c); //c.toString()자동호출됨
		//반목문으로 저장되어있는 자료들을 출력
		/*for (int i = 0; i < c.size(); i++) {
			object obj = c.get(i) // ?
		}*/
		for(Object 	obj:		 c){ //향상된 for문
			System.out.print(obj + ", ");
		}
	}
	public static void main(String[] args) {
		test( new ArrayList()	);
		test( new HashSet()		);
	}

}
