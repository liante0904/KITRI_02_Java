import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPSender {
	public static void main(String[] args) throws IOException {

		DatagramSocket socket = new DatagramSocket();
		for(int i=1; i<=3; i++){
			String data = "메세지";
			DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length, new InetSocketAddress("localhost", 5001)
					);
			socket.send(packet);
		}
		socket.close();
	}
}