class Join extends Thread{
	int sum, to, from;
	Join(int from, int to){
		this.from = from;
		this.to = to;
	}

	public void run(){
		for(int i=from; i <= to; i++){
			sum += i;
		}
	}
}

public class JoinTest {

	public static void main(String[] args) {
		Join j1 = new Join(1, 10);
		Join j2 = new Join(11, 20);
		j1.start();
		j2.start();
		
		try {
			j1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~10의 합 : " + j1.sum);
		System.out.println("11~20의 합 :" + j2.sum);
		
	}

}
