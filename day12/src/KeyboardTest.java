import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) {
		InputStream k;
		k = System.in;

		/*try {
			int readValue = k.read();
			System.out.println((char)readValue);
			System.out.println(readValue);
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		InputStreamReader isr = new InputStreamReader(k);
		try 
		{
			int readValue = -1;
			while((readValue = isr.read()) != -1)
			{
				System.out.print(readValue + ":" + (char)readValue);	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
