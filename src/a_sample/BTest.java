package a_sample;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BTest extends JFrame {			//상속받아서 쓰는 방식

	JButton btn ;
	
	BTest(){
		super("나의 두번째창");				//부모 클래스의 생성자 호출
		btn = new JButton("확인2");
	}
	void addLayout() {						//부모의 메소드를 그대로 받아서 사용
	
		add(btn);
		
		setBounds(100, 100, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {

		BTest b = new BTest();
		b.addLayout();
		
	}

}
