import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Horse extends Canvas implements Runnable {
	String name;
	int x, y;
	public Horse(String name) {
		this.name = name;
		x = 0;
		y = 10;
	}	
	public void paint(Graphics g){
		g.drawString(name, x, y);
	}
	@Override
	public void run() {
		for(int i =0; i<=20; i++){
				//x += (int)(Math.random()*10);
				x+=10;
				repaint();
				long millis = (int)(Math.random()*1000); //0~999사이의 값
				try {
					Thread.sleep(millis);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
}
public class HorseRace {
	Horse[] horses = new Horse[3];
	JFrame frame;		//gui액자
	JButton btStart, btReady; //gui버튼
	HorseRace(){
		frame = new JFrame();
		for(int i=0; i<horses.length; i++){
			horses[i] = new Horse((i+1)+"번 말");
		}
		btStart = new JButton("달려");
		btReady = new JButton("준비");
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기를 누르면 종료된다.
		
		btStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(Horse h: horses){
					
					new Thread(h).start();
					
				}
					
				/*for(int i =0; i<=20; i++){
					for(Horse h: horses){
						h.x += 10;
						h.repaint();	
					}
				}*/
				
			}
		});
		//TODO 각 말의 x위치를 20번 이동. 
		//한번 이동할 때마다 10씩증가한다.
		//증가후 repaint()호출
		
		
		btReady.addActionListener(new ActionListener() { //익명 클래스 객체를 이용해 actionperformed로 동작
			@Override
			public void actionPerformed(ActionEvent e) {				
				for(Horse h: horses){
					h.x = 0;
					h.repaint(); //화면에서 h가 clear된 후 h의 paint()가 자동호출됨 
				}				
			}
		});
		
	
		Container c = frame.getContentPane();
		c.setLayout(new GridLayout(4, 1));
		for(Horse h: horses){
			c.add(h);//h의 paint()가 자동호출됨	
		}
		JPanel panel = new JPanel();
		panel.add(btReady);
		panel.add(btStart);
		c.add(panel);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new HorseRace();
	}

}
