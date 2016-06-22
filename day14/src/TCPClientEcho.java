import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientEcho {
	Socket s;
	OutputStream os;
	DataOutputStream dos;
	DataInputStream dis;
	
	String host = "127.0.0.1";
	int port = 5432;
	public TCPClientEcho() {
		try {
			s = new Socket(host, port); // 서버 접속 url, port
			// 소켓과 연결된 스트림 얻기
			os = s.getOutputStream();
			dos= new DataOutputStream(os);
			dis = new DataInputStream(s.getInputStream());
			// 출력(스트림 출력하기) 
			//os.write(49); // 바이트 코드의 메소드이므로, 문자1이 출력

			/*for(int i = 1; i<=10; i++)
			{
				dos.writeInt(1);
				dos.writeUTF("안녕하세요 KITRI맨입니다");
				dos.writeUTF("배가 고파요");
			}*/

			//dos.writeInt(1);
			//dos.writeUTF("안녕하세요 KITRI맨입니다");

			//키보드로 "quit"이 입력될때까지 반복 출력하기

			Scanner keyboard = new Scanner(System.in);
			int i=1;
			String keyboardValune = null;
			/*	while(!(keyboardValune =keyboard.nextLine()).equals("quit"))
			{
				dos.writeInt(i);
				dos.writeUTF(keyboardValune);
					i++;
			}*/
			// quit을 쓸경우, 바로 종료됨 (서버에 quit값은 전달되지 않는다.)

			do {				
				keyboardValune =keyboard.nextLine();
				dos.writeInt(i);
				dos.writeUTF(keyboardValune);
				int readI = dis.readInt();
				String readS = dis.readUTF();
				System.out.println("서버가 보내준 자료 :" + readI + "," + readS);
				
				i++;
			} while (!keyboardValune.equals("quit"));


		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (ConnectException e) {
			System.out.println("서버와 연결할 수 없습니다. ");
		} catch (SocketException e) { 
			System.out.println("서버가 터졌습니다. 그만보내주세요 ㅠㅠ ");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(s != null)
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}

	}

	public static void main(String[] args) {

		new TCPClientEcho();
	}

}
