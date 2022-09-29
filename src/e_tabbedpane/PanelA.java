package e_tabbedpane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel {

	JLabel aLa = new JLabel("판데기 A");
	JButton aBtn = new JButton("A 버튼");
	
	MainTest parent;


	public PanelA(MainTest mainTest){		//MainTest에서 panelA = new PanelA(this); 형태로 썼기 때문에 이를 받기위해서 입력매개변수를  MainTest mainTest로 씀
		
		parent = mainTest;			//주소값만 받는다.
		
		setBackground(new Color(200,100,150)); 		//RGB(Red, Green, Blue) , 0,0,0이면 검은색
		addLayout();
		eventProc();
	}
	void addLayout() {
		add(aLa);
		add(aBtn);
	}

	public void eventProc() {
		aBtn.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {
				parent.la.setText("안녕하세요");
			}
		});//end of addActionListener
	}//end of eventProc
}
