package kiosk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MainTest {
	// 1. 멤버변수 선언
		JFrame k;
		JButton kFood,cFood,iFood,jFood;
		JLabel title;
		JTextArea ta;
		PanelA panelA;
		PanelB panelB;
		PanelC panelC;
		PanelD panelD;
			
	// 2. 생성자 생성
		MainTest(){
			k = new JFrame("kosmo 휴게점 키오스크");
			kFood = new JButton("한식");
			cFood = new JButton("중식");
			iFood = new JButton("양식");
			jFood = new JButton("일식");
			title = new JLabel("KOSMO 휴게소");
			title.setOpaque(true);
			title.setBackground(Color.BLACK);
			title.setFont(new Font("바탕체",Font.BOLD,30));
			title.setForeground(Color.WHITE);
			title.setHorizontalAlignment(JLabel.CENTER);
			ta = new JTextArea(10,10);
			
			panelA = new PanelA(this);
			panelB = new PanelB(this);
			panelC = new PanelC(this);
			panelD = new PanelD(this);
			
		}
			
		void addLayout() {
			k.setLayout(new BorderLayout()); 
			k.add(title, BorderLayout.NORTH);
			JTabbedPane tab =  new JTabbedPane();
			tab.addTab("한식", panelA);				
			tab.addTab("중식", panelB);
			tab.addTab("양식", panelC);
			tab.addTab("일식", panelD);
		
			k.add(tab, BorderLayout.CENTER);
			
			k.setBounds(100, 200, 850, 500);						
			k.setVisible(true);										 
			k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}

	public static void main(String[] args) {
		MainTest kio = new MainTest();
		kio.addLayout();
		//PanelC c = new PanelC();
		//c.addLayout();
	
		}

	}


