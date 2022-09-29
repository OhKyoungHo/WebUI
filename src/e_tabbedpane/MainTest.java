package e_tabbedpane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

public class MainTest {
	//변수 선언
	JFrame f;
	JButton btn;
	JLabel la;

	PanelA panelA;
	PanelB panelB;
	PanelC panelC;

	//생성자 만들기
	MainTest(){
		f =new JFrame("나의 창");
		btn = new JButton("확인");
		la = new JLabel("데이터");

		panelA = new PanelA(this);
		panelB = new PanelB();
		panelC = new PanelC();

	}
	//화면에 출력할 메소드 생성
	void addLayout() {

		f.setLayout(new BorderLayout());
		f.add(btn, BorderLayout.EAST);			//버튼을 동쪽에 위치
		f.add(la, BorderLayout.SOUTH);			//"데이터"라는 라벨을 남쪽에 위치

		JTabbedPane tab =  new JTabbedPane();	//JTabbedPane 객체 생성
		tab.addTab("메인", panelA);				//addTab에 이름, 변수 입력
		tab.addTab("서브", panelB);
		tab.addTab("기타", panelC);

		f.add(tab, BorderLayout.CENTER);		//가운데 위치 설정



		f.setBounds(100, 100, 500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	//확인 버튼 눌렀을때 A판데기 → Welcome 로 바꾸기
	public void eventProc() {
		btn.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {	
				panelA.aLa.setText("Welcome");			//panelA에서 aLa의 값에 "welcome"입력

			}//end of ActionListener
		}); //end of addActionListener
	}//end of eventProc()


	public static void main(String[] args) {

		MainTest test =  new MainTest();
		test.addLayout();			//addLayout() 메소드 호출
		test.eventProc();			//eventProc() 메소드 호출
	}

}
