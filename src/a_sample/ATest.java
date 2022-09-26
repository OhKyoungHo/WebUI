package a_sample;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
/*
 * 자바의 GUI
 * - AWT : 1.2 버전
 * - Swing : 1.2 이후
 * 			 대부분 클래스 앞에 J	
 */
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ATest {		//직접 객체생성해서 사용

	JFrame f;
	JButton btn,bCancel ;
	JCheckBox bJava,bOracle;			//다중 선택을 만들때 사용
	JRadioButton manRadio, womanRadio;	//하나만 선택해야 할때 사용
	JTextField tf;						//한줄의 문자열을 입력받는 창
	JTextArea ta;						//여러 줄의 문자열을 입력받을 수 있는 창
	
	ATest(){
		f = new JFrame("나의 첫창");	//생성자에 타이틀 초기화
		btn = new JButton("클릭");		//NullPointerException 오류가 뜨면 줄을 찾아보면서 문제 찾기
		bCancel = new JButton("취소");
		bJava = new JCheckBox("자바");
		bOracle = new JCheckBox("오라클");
		manRadio = new JRadioButton("남자");
		womanRadio = new JRadioButton("여자");
		ButtonGroup group = new ButtonGroup();		//버튼 그룹 객체 생성
		group.add(manRadio);						//ButtonGroup으로 그룹화
		group.add(womanRadio);
		tf = new JTextField(20);
		ta = new JTextArea(40,20);
	}
	
	void addLayout() {	
		//f.setLayout(new FlowLayout()); 	// 동시에 FlowLayout 객체 생성하면서 값넣기, 1줄에 배치
		//f.setLayout(new GridLayout(3,3));	// 행,열에 맞춰 배치	
		f.setLayout(new BorderLayout()); 	// 동/서/남/북/가운데 배치
		//붙이기 작업
		f.add(btn, BorderLayout.NORTH);			//창에 클릭버튼 추가
		f.add(bCancel, BorderLayout.SOUTH);		//창에 취소버튼 추가
		//f.add(bJava);		//창에 자바버튼 추가
		//f.add(bOracle);
			JPanel pEast =  new JPanel();		//컴포넌트들을 그룹 별로 묶어서 처리할 때 사용하는 컨테이너
			pEast.add(manRadio);
			pEast.add(womanRadio);
		f.add(pEast, BorderLayout.EAST);
			
		//f.add(manRadio, BorderLayout.EAST); 		//
		//f.add(womanRadio, BorderLayout.EAST);		//위의 남자를 덮어씀 여자 버튼만 출력
		f.add(new JLabel("입력하세요"), BorderLayout.WEST);	
		//f.add(tf, BorderLayout.EAST);
		f.add(ta, BorderLayout.CENTER);
		
		//화면 출력
		f.setBounds(100, 100, 500, 350);						// 크기지정
		f.setVisible(true);										// 창을 화면에 나타낼 것인지 설정 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// x버튼 눌렀을 경우에 종료할 수 있도록 설정하는 함수.
	}
	
	public static void main(String[] args) {
		ATest a = new ATest();
		a.addLayout();											// 출력을 위해서 메소드 호출

	}

}
