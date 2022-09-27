package c_sample;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


/*
 * 화면(JFrame)에 '확인' 버튼 하나 추가
 */

public class EventTest {

	//1. 멤버변수선언
	JFrame g;
	JButton click;
	JTextArea ta;

	//2. 멤버변수 객체 생성
	EventTest(){					//관련 생성자 생성
		g =  new JFrame("창");		//제목 짓기
		click = new JButton("확인");	//버튼에 내용 입력
		
	//  (2) 핸들러 객체 생성
		MyHandler hdlr =  new MyHandler();
	//	(3) 이벤트 발생할 컴포넌트와 연결	
		click.addActionListener(hdlr); 
	}
	//(1) 이벤트핸들러(이벤트를 처리하는 클래스) 만들기
	class MyHandler implements ActionListener{			//인터페이스 ActionListener로 부터 상속
		public void actionPerformed(ActionEvent e) {	//오버라이딩
			JOptionPane.showMessageDialog(null, "이벤트 발생");

		}

	}

	void eventView(){
		g.setLayout(new FlowLayout());


		//화면에 추가하기
		g.add(click);

		//화면 크기 및 실현을 위한 조건 설정
		g.setBounds(100, 200, 400, 350);						// 크기지정
		g.setVisible(true);										// 창을 화면에 나타낼 것인지 설정 
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EventTest e = new EventTest();
		e.eventView();


	}

}
