class Share{
	int data;
	void push()
	{ 
		for(int i=0; i<1000; i++)
		{
			synchronized (this) 
			{			
				System.out.print("before push:" + data + "," );
				data++;//1)값1증가, 2)변수에 대입
				System.out.println("after push:" + data+ ",");
			}
		}
	}
	void pop()
	{
		for(int i=0; i<1000; i++)
		{
			synchronized (this) 
			{
				System.out.print("before pop:" + data+ ",");
				data--;	
				if(data ==0){
					
				}
				System.out.println("after pop:" + data+ ",");
			}
		}
	}
}
class Push extends Thread
{
	Share share;
	Push(Share share){
		this.share = share;
	}
	public void run(){
		share.push();
	}
}
class Pop extends Thread

{
	Share share;
	Pop(Share share){
		this.share = share;
	}
	public void run(){
		share.pop();
	}
}

public class ShareTest {
	public static void main(String[] args) {
		Share s = new Share();
		/*Push push = new Push();
		push.share = s;*/
		Push push = new Push(s);
		Pop pop = new Pop(s);
		push.start();
		pop.start();
	}
}









