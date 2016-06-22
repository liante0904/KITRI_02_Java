import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		String filename = "a.txt";
		FileInputStream fis; //파일자원과 연결 과정
		try {
			fis = new FileInputStream(filename);
	/*		int readValue = -1;
			while( (readValue = fis.read() ) != -1 )
			{
				System.out.print(readValue + ":" + (char)readValue );
			}*/
			byte[] arr = new byte[1024];  // 1024byte-> 1kbyte씩 읽어오고, 읽은 데이터는 배열에 저장된다.
			int readCnt = fis.read(arr); // 실제 저장된 데이터값을 count하고(readCnt) 그 데이터만큼만 반복문을 수행한다.
			for (int i = 0; i < readCnt; i++) 
			{
				int readValue = arr[i];
				System.out.print(readValue + ":" + (char)readValue );
			}
			
		} catch (FileNotFoundException e) { //다중 catch시에는 상위부터 catch문을 만들어야 한다.
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

