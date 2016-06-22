import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class TCPServerEcho {
	ServerSocket ss;
	Socket s;
	InputStream is;
	DataInputStream dis;
	DataOutputStream dos;
	
	int port=5432;
	TCPServerEcho(){
		try {			
			//포트열기
			ss = new ServerSocket(port);//0~65535가능.  0~1024는 예약포트
			while(true){
				//클라이언트접속 기다리기
				s = ss.accept();
				String client; // 접속한 클라이언트 IP값
				InetAddress clientInfo = s.getInetAddress();
				client = clientInfo.getHostName();
				System.out.println(client + " 접속했습니다.");
				try{
					//TODO
					is = s.getInputStream();
					dis = new DataInputStream(is);
					dos = new DataOutputStream(s.getOutputStream());
					
					while(true){				
						int readI = dis.readInt();
						String readS = dis.readUTF();
						if(readS.equals("quit")){
							break;
						}
						System.out.println(client + " 보내준 자료:" + readI + "," + readS);
						dos.writeInt(readI);
						dos.writeUTF(readS);
					}
				}catch(Exception e){//2)
				}finally{
					try{
						s.close();
					}catch(Exception e){						
					}
					System.out.println(client +  " 접속해제했습니다.");
				}
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new TCPServerEcho();
	}

}
