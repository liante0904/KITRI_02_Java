import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://apple.com");

		InputStream is=	url.openStream();
		BufferedReader br = new BufferedReader(new  InputStreamReader(is));


		FileWriter fw = new FileWriter("test.html");
		String line = "";
		while((line = br.readLine()) != null){
			System.out.println(line);
			fw.write(line);
			
		}
		fw.close();
	}

}
