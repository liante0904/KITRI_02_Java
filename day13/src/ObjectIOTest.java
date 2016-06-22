import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.my.dto.Employee;
import com.my.dto.Manager;

public class ObjectIOTest {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(  new InputStreamReader(System.in ) );
		
		System.out.println("작업을 선택하세요 :1-쓰기, 2-읽기, 3-종료");
		try {
			String line = br.readLine();
			String fileName = "o.ser";
			if(line.equals("1"))
			{
				write(fileName);
			}	else if(line.equals("2"))
			{
				read(fileName);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void read(String fileName) throws ClassNotFoundException, IOException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
		while(true)
		{
		Object obj = ois.readObject();
		System.out.println(obj);
		}
		
	}
	public static void write(String fileName){
		//파일 목적지에 바이트 단위의 쓰기 
		FileOutputStream fos = null;
		//객체단위로 쓰기
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fileName); // 노드스트림
			oos = new ObjectOutputStream(fos); //필터 스트림
			oos.writeObject( new Date() );
			oos.writeObject(new Employee("n1","name1","010", 1000) );
			oos.writeObject(new Manager("n2","name2","020", 2000,20) );
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(oos != null)
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
