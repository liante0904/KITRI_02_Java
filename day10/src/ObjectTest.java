
public class ObjectTest {

	public static void main(String[] args) {

			Object o1,o2;
			//hashcode
			o1 = new Object();
			o2 = new Object();
			
			int h1 = o1.hashCode();
			int h2= o2.hashCode();
			System.out.println(h1== h2); // false
			
			//toString
			
			String h1Str = o1.toString();
			String h2Str = o2.toString();
			System.out.println(h1Str);
			System.out.println(h2Str);
			
			
			//equals : ==와 같음
			
			
			System.out.println(o1 == o2);
			System.out.println(o1.equals(o2));  // false
			
	}

}
