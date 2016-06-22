class Single{
	private Single(){	
	}
	static Single s = new Single();
	int i;
	static Single getInstance(){
		return s;
		
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		Single s1, s2;
		s1 = Single.getInstance();
		s2 = Single.getInstance();
		System.out.println(s1 == s2);
		s1.i++;
		
	}
	
		
	}





