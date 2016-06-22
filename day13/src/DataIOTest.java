import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "d.dat";
		write(fileName);
		read(fileName);
		
	}
	
	public static void read(String fileName) {
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new FileInputStream(fileName));
			
			int i = dis.readInt();
			long l = dis.readLong();
			double d = dis.readDouble();
			String s = dis.readUTF();
			
			System.out.println(i + ":" + l + ":" + d + ":" + s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dis != null)
					dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void write(String fileName) {
		FileOutputStream fos = null;
		
		// 데이터 타입별로 쓰기
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream(fileName);
			dos = new DataOutputStream(fos);
			
			dos.writeInt(10);
			dos.writeLong(10L);
			dos.writeDouble(12.3);
			dos.writeUTF("고자라니");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close();
				
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}