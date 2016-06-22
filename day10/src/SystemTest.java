
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class SystemTest {
	public static void main(String[] args) throws IOException {
		
		
			InputStream is = System.in;
			int readValue = is.read();
			System.out.println(readValue + "(char) = " + (char) readValue);
			
			
			
			long before = System.currentTimeMillis();
			for(long i = 0; i<9999999000L; i++){
				//처리
			}
			long after= System.currentTimeMillis();
			System.out.println("반복문 처리시간:" + (after - before));
			Date aTime = new Date(after);
			Date bTime = new Date(before);
			System.out.println("처리 전 시간:" + bTime);

			System.out.println("처리 휴 시간:" + aTime);

	}
}
