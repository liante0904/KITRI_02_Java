import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

class ServerThread extends Thread{
	InputStream is;
	DataInputStream dis;
	DataOutputStream dos;
	String client; // 접속한 클라이언트 IP값
	Socket s;
	Vector<ServerThread> list;
	public ServerThread(Socket s, Vector<ServerThread> list) throws IOException {
		this.s=s;
		this.list =list;
		InetAddress clientInfo = s.getInetAddress();
		client = clientInfo.getHostName();
		System.out.println(client + " 접속했습니다.");
		is = s.getInputStream();
		dis = new DataInputStream(is);
		dos = new DataOutputStream(s.getOutputStream());
	}
	public void broadcast(int sendDate){
		for(int i =0; i<list.size(); i++)
		{
			ServerThread t = list.get(i);
			try {
				t.dos.writeInt(sendDate);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void brodcast(String sendData){
		for(int i =0; i<list.size(); i++)
		{
			ServerThread t = list.get(i);
			try {
				t.dos.writeUTF(sendData);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void run(){
		try{
			while(true){				
				//int readI = dis.readInt();
				String readS = dis.readUTF();
				if(readS.equals("quit")){
					break;
				}
				/*System.out.println(client + " 보내준 자료:" + readI + "," + readS);
				dos.writeInt(readI);
				dos.writeUTF(readS);
			*/
				//broadcast(readI);
				//broadcast(readS);
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
}

public class TCPServerMultithread {
	ServerSocket ss;
	Socket s;

	int port=5432;
	Vector<ServerThread> list = new Vector<ServerThread>();
	
	TCPServerMultithread(){
		try {			
			//포트열기
			ss = new ServerSocket(port);//0~65535가능.  0~1024는 예약포트
			while(true){
				//클라이언트접속 기다리기
				s = ss.accept();
				ServerThread t =new ServerThread(s,list);
				list.add(t);
				t.start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			new TCPServerMultithread();
		}

	}
