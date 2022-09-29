package kiosk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class PanelC extends JPanel {
	MainTest parent;
	
	JButton cBtn1 = new JButton("까르보나라 8000원", new ImageIcon("src\\kiosk\\까르보나라.jpg"));
	JButton cBtn2 = new JButton("봉골레파스타 8000원", new ImageIcon("src\\kiosk\\봉골레.jpg"));
	JButton  cBtn3 = new JButton("로제파스타 10000원", new ImageIcon("src\\kiosk\\로제.jpg"));
	JButton  cBtn4 = new JButton("오믈렛 8000원", new ImageIcon("src\\kiosk\\오믈렛.jpg"));
	JButton  cBtn5 = new JButton("필라프 8000원", new ImageIcon("src\\kiosk\\필라프.jpg"));
	JButton cBtn6 = new JButton("리조또 8000원", new ImageIcon("src\\kiosk\\리조또.jpg"));
	JButton cBtn7 = new JButton("스테이크 12000원", new ImageIcon("src\\kiosk\\스테이크.jpg"));
	JButton cBtn8 = new JButton("토마토 스파게티 8000원", new ImageIcon("src\\kiosk\\스파게티.jpg"));
	
	PanelC(){
		
	}
	
	public PanelC(MainTest kio) {
		parent = kio;
		setBackground(new Color(250,250,250));
		cBtn1.setBackground(new Color(250,250,250));
		cBtn1.setHorizontalTextPosition(JButton.CENTER); 					//버튼에 있는 글들 수평맞추기
		cBtn1.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn2.setBackground(new Color(250,250,250));
		cBtn2.setHorizontalTextPosition(JButton.CENTER); 					//버튼에 있는 글들 수평맞추기
		cBtn2.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn3.setBackground(new Color(250,250,250));
		cBtn3.setHorizontalTextPosition(JButton.CENTER); 					//버튼에 있는 글들 수평맞추기
		cBtn3.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn4.setBackground(new Color(250,250,250));
		cBtn4.setHorizontalTextPosition(JButton.CENTER); 					//버튼에 있는 글들 수평맞추기
		cBtn4.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn5.setBackground(new Color(250,250,250));
		cBtn5.setHorizontalTextPosition(JButton.CENTER); 					//버튼에 있는 글들 수평맞추기
		cBtn5.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn6.setBackground(new Color(250,250,250));
		cBtn6.setHorizontalTextPosition(JButton.CENTER); 					//버튼에 있는 글들 수평맞추기
		cBtn6.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn7.setBackground(new Color(250,250,250));
		cBtn7.setHorizontalTextPosition(JButton.CENTER); 					//버튼에 있는 글들 수평맞추기
		cBtn7.setVerticalTextPosition(JButton.BOTTOM);
		
		cBtn8.setBackground(new Color(250,250,250));
		cBtn8.setHorizontalTextPosition(JButton.CENTER); 					//버튼에 있는 글들 수평맞추기
		cBtn8.setVerticalTextPosition(JButton.BOTTOM);
		addLayout();
	}
	void addLayout() {
		
		
		JPanel pCenter =  new JPanel(new GridLayout(3,3));
	
		add(pCenter, BorderLayout.CENTER);
		pCenter.add(cBtn1);
		pCenter.add(cBtn2);
		pCenter.add(cBtn3);
		pCenter.add(cBtn4);
		pCenter.add(cBtn5);
		pCenter.add(cBtn6);
		pCenter.add(cBtn7);
		pCenter.add(cBtn8);
	
}
	

}
