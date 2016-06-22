

import java.text.SimpleDateFormat;
import java.util.Date;

import com.my.dto.Product;

class Normal{
	public void run(){
		Thread t = Thread.currentThread();
		// 1~100까지 출력
		for(int i = 1; i<=100; i++){
			System.out.println(t.getName() + ":" + i);
		}
	}
}

class First extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		// 1~100까지 출력
		for(int i = 1; i<=100; i++){
			System.out.println(t.getName() + ":" + i);
		}
	}
}

class Second extends Product implements Runnable{

	@Override
	public void run() {
		// 현재시간 출력하기
		String dt = "hh:mm:ss";
		SimpleDateFormat sdf = 
				new SimpleDateFormat(dt);
		for(int i = 0; i<10; i++){
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}

public class ThreadTest {
	public void test( ) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		test.test();

		//Normal normal = new Normal();
		//normal.run();


		First first = new First();
		First second = new First();
		Second se= new Second();
		Thread three = new Thread(se);
		//first.run();
		first.start(); // start method로 thread를 활성화 시킨다.
		second.start();
		System.out.println("END OF MAIN!");
		// s.start();
		three.start();
	}

}
