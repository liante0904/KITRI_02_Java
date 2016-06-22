import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * GUI 용 프로그램 종류
 *  - java.awt패키지		: os에서 제공되는 컴포넌트를 자바에서 사용
 *  - javax.swing패키지	: 자바에서 독립적으로 만든 컴포넌트
 *  **/

//inner class
/*class MyListener implements ActionListener{ //MyListener 클래스가 행위를 감시하기 위해서는 ActionListner라는 인터페이스를 구현한다.
	int counter;
	JTextField tf = new JTextField();
	MyListener(JTextField tf){
		this.tf = tf;
	}
	public void actionPerformed(ActionEvent e){
		// System.out.println("클릭되었습니다.");
		//JTextField tf = new JtextField();
		tf.setText(++counter +"클릭되었습니다.");
	}
}*/
public class GUIEventTest {
	private JFrame frame;
	private JButton bt;
	private JTextField tf;


	GUIEventTest(){
		frame = new JFrame(); // 액자
		bt = new JButton("클릭"); //액자에 붙여넣을 컴포넌트
		tf = new JTextField(30); // 액자 뒷종이
		Container c = frame.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(bt); //컴포넌트를 붙이기
		c.add(tf);

		//int counter = 0;
		final int counter = 0;
		//로컬 클래스

		bt.addActionListener(//익명 클래스
				new ActionListener(){ 
					public void actionPerformed(ActionEvent e){
						tf.setText(counter +"클릭되었습니다.");
					}
				}
				);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}


	/*	//멤버 클래스
	class MyListener implements ActionListener{ //MyListener 클래스가 행위를 감시하기 위해서는 ActionListner라는 인터페이스를 구현한다.
		int counter;
		MyListener(JTextField tf){
		}
		public void actionPerformed(ActionEvent e){
			tf.setText(++counter +"클릭되었습니다.");
		}
	}
	GUIEventTest(){
		frame = new JFrame(); // 액자
		bt = new JButton("클릭"); //액자에 붙여넣을 컴포넌트
		tf = new JTextField(30); // 액자 뒷종이
		Container c = frame.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(bt); //컴포넌트를 붙이기
		c.add(tf);

		bt.addActionListener(new MyListener(tf));
		frame.setSize(500, 200);
		frame.setVisible(true);
	}*/



	/*	GUIEventTest(){
		frame = new JFrame(); // 액자
		bt = new JButton("클릭"); //액자에 붙여넣을 컴포넌트
		tf = new JTextField(30); // 액자 뒷종이
		Container c = frame.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(bt); //컴포넌트를 붙이기
		c.add(tf);

		bt.addActionListener(new MyListener(tf));
		frame.setSize(500, 200);
		frame.setVisible(true);
	}*/
	public static void main(String[] args) {
		new GUIEventTest();
	}
}