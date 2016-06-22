
import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		String s1,s2,s3,s4;
		s1 = new String("HELLO");
		s2 = new String("HELLO");
		s3 ="HELLO";
		s4 ="HELLO";
		System.out.println(s1 == s2);		//false
		System.out.println(s1 == s3);		//false
		System.out.println(s3 == s4);		//true

		// 즉 메모리는 3개가 생성된다. s1,s2 는 서로 다른 메모리를 가지고, s3,s4는 서로 같은 메모리를 참조하게 되어 
		// 총 3개가 된다.

		System.out.println(s1 + "JAVA"); // HELLO JAVA
		System.out.println(s1); // HELLO
		System.out.println(s1.toLowerCase()); // hello
		System.out.println(s1); // HELLO

		s1 = s1 + "JAVA"; // 이때 s1은 HELLO + JAVA라는 값을 새로 만들어 참조하게 되고
		// 최초의 String HELLO는 그대로 남아있게 된다.
		System.out.println(s1); // HELLO JAVA

		s1 =new String("HELLO");
		// String 에서의 equals는 문자열만을 비교하므로, 메모리 번지수의 번지수와 관계하지 않는다.
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s3.equals(s4)); //true

		String str = "HELLO JAVA JDBC WEB SPRING ANDROID";
		str.indexOf("SPRING"); //문자열의 위치값을 찾아준다.
		System.out.println(str.indexOf("SPRING"));
		int index = str.indexOf("C++");
		System.out.println(index); // -1 (문자열이 존재하지 않을경우 반환값)


		System.out.println(str.substring(6, 9)); // JAVA? = JAV

		int size = str.length(); // length는 byte값이 아닌 글자 갯수자체로 반환을 하게된다. (한글이외 포함)
		System.out.println(size); // 34


		char c= str.charAt(16); // 특정위치의 문자 (16번쨰) 
		System.out.println(c); //W

		String [] arr = str.split(" ", 6);
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		} //?

		// "Hello Java"
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

		str= "100:90::70:50"; // JAVA 점수 : JDBC점수 : WEB: SPRING: ANDROID:

		arr = str.split("\\:", 6);
		for(int i = 0; i<arr.length; i++){
			System.out.println("split:" + arr[i]);
		} // 빈 문자열을 구분하여 데이터를 나눠준다.

		st = new StringTokenizer(str, ":");
		while(st.hasMoreTokens()){
			System.out.println("==" + st.nextToken());
		} // 빈 문자열을 취급하지 않고 문자를 잘라준다.


		str = "토마토";// 일요일, ....
		// 토마토는 Palindrome문자열입니다.

		boolean flag = isPalindrome(str);
		if(flag){
			System.out.println(str + "은 Palindrome 문자열 입니다.");
		}


		str = "ABCD";
		//ABCD는 paLindrome문자열이 아닙니다.
		flag = isPalindrome(str);
		if(!flag){
			System.out.println(str + "은 Palindrome문자열이 아닙니다.");
		}

		
			StringBuffer sb= new StringBuffer("HELLO"); //객체내용 변경가능
			sb.append(" JAVA");
			//sb = "HELLO"; sb + "JAVA"; //안됨
			//equals()오버라이딩 안되어있음.
			StringBuffer sb1 =new StringBuffer("HELLO JAVA");
			System.out.println(sb== sb1); //false
			System.out.println(sb.equals(sb1)); //false 
			// 문자열 비교가 바로 가능하지 않으며, 메모리 번지수를 비교한다.
			// StringBuffer의 toString()를 활용해서 String타입으로 반환
			System.out.println(sb.toString().equals(sb1.toString())); // true
		
	}

	public static boolean isPalindrome(String str) {
		int size = str.length();
		for(int i=0; i<size/2; i++){
			if(str.charAt(i) != str.charAt(size-1-i)){
				return false;
			}
		}
		return true;
	}
}

