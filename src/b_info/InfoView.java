package b_info;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

import javax.imageio.ImageIO;
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
		aAdd = new JButton("Add", new ImageIcon("src\\b_info\\imgs\\add.png"));		//add에 그림 넣기, 파일위치 표시
		aAdd.setHorizontalTextPosition(JButton.CENTER); //						//버튼에 있는 글들 수평맞추기
		aAdd.setVerticalTextPosition(JButton.BOTTOM);
		bShow = new JButton("Show", new ImageIcon("src\\b_info\\imgs\\show.png"));		//show에 그림 넣기, 파일위치 표시
		bShow.setHorizontalTextPosition(JButton.CENTER); //						//버튼에 있는 글 중간에 위치시키기
		bShow.setVerticalTextPosition(JButton.BOTTOM);							//버튼에 있는 글 그림 밑으로 이동
		bSearch = new JButton("Search", new ImageIcon("src\\b_info\\imgs\\search.png"));
		bSearch.setHorizontalTextPosition(JButton.CENTER); //						//버튼에 있는 글 중간에 위치시키기
		bSearch.setVerticalTextPosition(JButton.BOTTOM);	
		bDelete = new JButton("Delete", new ImageIcon("src\\b_info\\imgs\\delete.png"));
		bDelete.setHorizontalTextPosition(JButton.CENTER); //						//버튼에 있는 글 중간에 위치시키기
		bDelete.setVerticalTextPosition(JButton.BOTTOM);
		bCancel = new JButton("Cancel", new ImageIcon("src\\b_info\\imgs\\cancel.png"));
		bCancel.setHorizontalTextPosition(JButton.CENTER); //						//버튼에 있는 글 중간에 위치시키기
		bCancel.setVerticalTextPosition(JButton.BOTTOM);
		bExit = new JButton("Exit(Alt + x)", new ImageIcon("src\\b_info\\imgs\\exit.png"));		//exit에 그림 넣기
		bExit.setHorizontalTextPosition(JButton.CENTER); //						//버튼에 있는 글 중간에 위치시키기
		bExit.setVerticalTextPosition(JButton.BOTTOM);//글자 수직위치 조정으로 그림 밑으로 보내기
		bExit.setRolloverIcon(new ImageIcon("src\\b_info\\imgs\\pencil.png"));	//마우스 올렸을때 그림 바뀌게 하기
		bExit.setPressedIcon(new ImageIcon("src\\b_info\\imgs\\pen.png"));		//해당 버튼을 눌렀을때 입력해놓은 이미지로 변환
		bExit.setToolTipText("프로그램을 종료합니다.");		//마우스를 올렸을때 "프로그램을 종료합니다"가 뜸
		bExit.setMnemonic('x');			//단축기 추가

		//
		ta = new JTextArea(50,10);

		/*try {
			aAdd.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("add.png"))));
			bShow.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("show.png"))));
			bSearch.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("search.png"))));
			bDelete.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("delete.png"))));
			bCancel.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("cancel.png"))));
			bExit.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("exit.png"))));
			System.out.println();
		}catch(Exception ex) {
			System.out.println("no Image");
		}*/
	}
	//3. 화면 구성하고 출력
	public void addLayout() {
		f.setLayout(new BorderLayout()); 
		JPanel pWest =  new JPanel(new GridLayout(6,2));
		f.add(pWest, BorderLayout.WEST);						//pwest를 서쪽으로 모아서 정렬
		pWest.add(new JLabel("Name",JLabel.CENTER),tfName);		//label 삽입&가운데 정렬
		pWest.add(tfName);										//textfield 추가
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


		JPanel pSouth =  new JPanel(new GridLayout(1,6));		// 버튼 들을 모아서 남쪽에 1행 6열로 만듦
		pSouth.add(aAdd);
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bExit);
		f.add(pSouth, BorderLayout.SOUTH);

		f.add(ta, BorderLayout.CENTER);							// textarea를 중앙에 배치

		f.setBounds(100, 200, 850, 350);						// 크기지정
		f.setVisible(true);										// 창을 화면에 나타낼 것인지 설정 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// x버튼을 누르면 콘솔 종료 설정

	}
	public void eventProc() {
		//'ADD'버튼을 눌렀을때 
		aAdd.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {	
				JOptionPane.showMessageDialog(null, "Add 버튼 클릭");
			}
		}
				); //end of addActionListener
		//주민번호 입력창에서 엔터 쳤을때
		tfId.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				getJuminInfo();
			}//end of actionPerformed	
		}); //end of addActionListener

		tfId.addFocusListener(new FocusListener(){	
			@Override
			public void focusGained(FocusEvent e) {

			}
			@Override
			public void focusLost(FocusEvent e) {
				getJuminInfo();

			}	
		});//end of addFocusListener

		bShow.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {	
				JOptionPane.showMessageDialog(null, "Show 버튼 클릭");
			}
		}
				); 
		bSearch.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {	
				JOptionPane.showMessageDialog(null, "Search 버튼 클릭");
			}
		}
				); 
		bDelete.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {	
				JOptionPane.showMessageDialog(null, "Delete 버튼 클릭");
			}
		}
				); 
		bCancel.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {	
				JOptionPane.showMessageDialog(null, "Cancel 버튼 클릭");
			}
		}
				); 
		bExit.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {	
				JOptionPane.showMessageDialog(null, "Exit 버튼 클릭");
			}
		}
				); 
	}//end of eventProc

	void getJuminInfo() {
		String jumin = tfId.getText();
		if(jumin.length()<14) {
			JOptionPane.showMessageDialog(null, "-를 포함한 15자를 맞춰주세요");
			return;
		}else
			tfId.setText( jumin);					//jumin의 값이 출력

		//(1) 주민번호의 7번째 문자로 성별을 구분하여 성별창에 출력
		char junum = jumin.charAt(7);						//7번째 수가 성별을 의미해서 설정

		if(junum == '1' || junum =='3' || junum =='9') {				//CHAR로 받아서 ''로 표시
			tfGender.setText("남자");
		}else if(junum == '2' || junum =='4' || junum =='0') {
			tfGender.setText("여자");
		}else {
			tfGender.setText("성별을 알 수 없습니다.");
		}
		//(2) 주민번호의 8번째 문자로 출신지를 구하여 출신지창에 출력
		char chul = jumin.charAt(8);
		//chul 변수가 0이라면 '서울'
		//chul 변수가 1이라면 '인천/부산'
		//chul 변수가 2라면 '경기'
		//chul 변수가 9라면 '제주'
		String home = null;
		switch (chul) { // ()에 문자, 정수, 문자열//switch문을 이용해서 해당하는 값을 리턴
		case '0': home = "서울"; break;
		case '1': home = "인천/부산"; break;
		case '2': home = "경기"; break;
		case '3': home = "충북"; break;
		case '4': home = "충남"; break;
		case '5': home = "전북"; break;
		case '6': home = "전남"; break;
		case '7': home = "경북"; break;
		case '8': home = "경남"; break;
		case '9': home = "제주"; break;
		default:
			tfHome.setText( "출신을 알 수 없습니다.");		//출신을 알 수 없는 경우 
		}
		tfHome.setText( home + " 출신");			//★텍스트 필드에서 텍스트를 읽어오려면 getText(), 텍스트를 쓰려면 setText()를 호출하면 된다.
		

		//(3) 주민번호에서 년도에 의해 나이를 구해서 나이창에 출력
		String old = jumin.substring(0, 2); // old = "20" //substring에서 2로 지정한 이유는 2전까지의 글자를 가져오는 것을 의미
		//문자열 → 정수변환
		int age = 0;
		int old1 = Integer.parseInt(old); // age = 20
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);

		if (junum == '1' || junum == '2') {		//char 값으로 받아서 조건문 만들기
			age = year - (1900 + old1) + 1;	//나이 계산
			String age1 = String.valueOf(age);	//나이값 String으로 바꿔주기
			tfAge.setText( age1 +"살");
		} else if (junum == '3' || junum == '4') {
			age = year - (2000 + old1) + 1;
			String age2 = String.valueOf(age);
			tfAge.setText( age2 +"살");
		}
	}

	protected String toStringvalue(int age) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();
	}

}
