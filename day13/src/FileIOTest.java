import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		//파일에 쓰기
		String filename = "b.txt";		// 1.목적지 선택
		FileOutputStream fos;				// 2. 노드스트림 선택 : 바이트 단위
		try {
			fos = new FileOutputStream(filename);	// 파일 만들기
			fos.write(49); // 숫자 1값이 파일에 저장되게 Parameters:b - the byte to be written.
			fos.write(234);fos.write(176);fos.write(128); // '가'값이 파일에 저장

			byte[] bs = "나다라마".getBytes();
			fos.write(bs);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		filename = "c.txt";
		FileWriter fw = null;
		try {
			fw = new FileWriter(filename, true); // 파일이 존재할경우 새로 생성하지 않고, 추가된다. (append)
			fw.write('1'); //숫자1값이 파일에 저장되도록 완성
			fw.write('가');
			fw.flush(); 	// flush 메소드를 이용해, 버퍼에 저장된 내용을 txt로 보낸다. 그전까진 버퍼에만 작성됨
			//혹은 버퍼가 꽉 채워지면 자동 flush됨
			fw.write("나다라마");
			fw.flush();
			fw.close(); // 자원과의 연결에 사용해준다. (연결해제)
			// 사용과 예외 발생시에 close를 해주어야 하므로. finally구문에 close를 넣어준다.

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fw !=null)
			{
				try {
					fw.close(); // close를 하는동안 nullpoint Exception이 발생할수 있는데 이는 컴파일시에는 발견할수 없는 에러이다.

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
