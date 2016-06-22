class Sound extends Thread{
	public void run(){
		while(true){
			System.out.println("소리");
		}
	}
}
class Caption extends Thread{
	public void run(){
		while(true){
			System.out.println("자막");
		}
	}
}
class Video extends Thread{
	public void run(){
		while(true){
			System.out.println("동영상");
		}
	}
}
public class ThreadTest {
	public static void main(String[] args) {
		Video v = new Video();
		//v.run();
		v.start();
		Caption c = new Caption();
		//c.run();
		c.start();
		Sound s = new Sound();
		//s.run();
		s.start();
	}
}
