package kiosk;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelA extends JPanel{
	JButton aBtn = new JButton("A 버튼");
	MainTest parent;
	
public PanelA(MainTest kio){		
		
		parent = kio;			//주소값만 받는다.
		
	}
void addLayout() {
	add(aBtn);
}

	
}
	

