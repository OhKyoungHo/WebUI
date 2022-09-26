package b_info;

import java.awt.*;
import javax.swing.*;

public class InfoView {
	
	//1. 멤버변수선언
	JFrame f;
	JTextField tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton aAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	
	
	//2. 멤버변수 객체 생성
	/*
	 * 전체 프레임은 BorderLayout으로 지정 
 		- WEST : JPanel 붙이기(GridLayout(6,2)으로 지정)
 		- CENTER : 텍스트에어리어
 		- SOUTH : JPanel 붙이기(GridLayout(1,6)으로 지정)
	 */
	InfoView(){
		f = new JFrame("DBTest");
		tfName = new JTextField(15);
		tfId = new JTextField();
		tfTel = new JTextField();
		tfGender = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();
		aAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
		ta = new JTextArea(50,10);
	}
	//3. 화면 구성하고 출력
	public void addLayout() {
		f.setLayout(new BorderLayout()); 
		JPanel pWest =  new JPanel(new GridLayout(6,2));
		pWest.add(new JLabel("Name",JLabel.CENTER),tfName);		//label 삽입&가운데 정렬
		pWest.add(tfName);										//textfield 삽입
		pWest.add(new JLabel("ID",JLabel.CENTER));
		pWest.add(tfId);
		pWest.add(new JLabel("Tel",JLabel.CENTER));
		pWest.add(tfTel);
		pWest.add(new JLabel("Sex",JLabel.CENTER));
		pWest.add(tfGender);
		pWest.add(new JLabel("Age",JLabel.CENTER));
		pWest.add(tfAge);
		pWest.add(new JLabel("Home",JLabel.CENTER));
		pWest.add(tfHome);
		f.add(pWest, BorderLayout.WEST);
		
		JPanel pSouth =  new JPanel(new GridLayout(1,6));
		pSouth.add(aAdd);
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bExit);
		f.add(pSouth, BorderLayout.SOUTH);
		
		f.add(ta, BorderLayout.CENTER);
		
		f.setBounds(100, 100, 500, 350);						// 크기지정
		f.setVisible(true);										// 창을 화면에 나타낼 것인지 설정 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		InfoView info = new InfoView();
		info.addLayout();
	}

}
