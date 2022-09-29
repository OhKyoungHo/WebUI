package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_Chi extends JPanel {

	JPanel panel;
	String chimenu[] = { "짜장면", "짬뽕", "굴짬뽕", "탕수육", "팔보채", "누룽지탕", "칠리새우", "꿔바로우", "멘보샤" };
	JButton[] menu = new JButton[chimenu.length];
	String price[] = { "7000", "9000", "11000", "17000", "28000", "32000", "21000", "18000", "22000" };
	JButton[] pricebtn = new JButton[price.length];
	String name;

	MainTest parent; // null
	int count;
//	private String chinamenu;

	
	public Panel_Chi(MainTest project) {
		parent = project;
		setBackground(Color.WHITE);
		initial();
		eventProc();
		//

	}

	public void addLayout() {
		initial();
		eventProc();
	}

	public void initial() {

		ImageIcon image[] = new ImageIcon[9];

		image[0] = new ImageIcon("src\\project\\button_image\\1.jpg"); // for문으로 이미지 배열
		image[1] = new ImageIcon("src\\project\\button_image\\2.jpg");
		image[2] = new ImageIcon("src\\project\\button_image\\3.jpg");
		image[3] = new ImageIcon("src\\project\\button_image\\4.jpg");
		image[4] = new ImageIcon("src\\project\\button_image\\5.jpg");
		image[5] = new ImageIcon("src\\project\\button_image\\6.jpg");
		image[6] = new ImageIcon("src\\project\\button_image\\7.jpg");
		image[7] = new ImageIcon("src\\project\\button_image\\8.jpg");
		image[8] = new ImageIcon("src\\project\\button_image\\9.jpg");

		setLayout(new GridLayout(3, 3));
//		fmenu.setPreferredSize(new Dimension(10, 10));
		for (int i = 0; i < 9; i++) {
			name = chimenu[i] + "/" + price[i];

			menu[i] = new JButton(name, image[i]); // 이미지 + 메뉴 이름 = menu[i]
			menu[i].setHorizontalTextPosition(JButton.CENTER);
			menu[i].setVerticalTextPosition(JButton.BOTTOM);
			menu[i].setFont(new Font(null, Font.BOLD, 15));
			add(menu[i]);
			menu[i].setBackground(Color.white);
			
		}

	}

	
	
	
	public void addchiLayout() {
		// 중식 메뉴 탭

	}

	public void eventProc() {
		
		// 메뉴명 클릭시 메뉴탭에 출력되는 이벤트
		for (int i = 0; i < menu.length; i++) { // 배열로 선언했기 때문에 반드시 for문
			menu[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
					// num[0] = 메뉴명
					// num[1] = 가격
					JButton menubtn = (JButton) e.getSource(); // getSource
					String[] num = menubtn.getText().split("/");
					
					System.out.println(num[0] + "/" + num[1]);
					inputData(num);
					clearTA();				
					showUp();
					
				}
			});
		}



	}
	public void inputData(String[] strArr) {
		PayVO p = new PayVO();		//PayVO에 입력내용 저장
		p.setMenu(strArr[0]);
		p.setPrice(strArr[1]);

		parent.list.add(p);
	}//inputData
	
	public void clearTA() {
		//각 TextArea의 내용을 비움
		parent.taMenu.setText(null);
		parent.taPrice.setText(null);
		
		//최종 금액, 개수 초기화
		parent.sum = 0;
		parent.sumCount.setText(String.valueOf(parent.list.size())+"개");
		parent.sumPrice.setText(String.valueOf(parent.sum)+"원");
	}
	
	//주문내역 출력 메소드
	public void showUp() {
		String input = null;
		for(PayVO vo : parent.list) {
			input = vo.toString();
			String[] arr = input.split("/");
			parent.taMenu.append(arr[0]+"\n");	// 메뉴 텍스트필드에 추가
			parent.taPrice.append(arr[2]+"\n");	// 가격 텍스트필드에 추가
			calSum(arr[2]);								// 최종 갯수/가격 설정
			
			//최종 갯수/가격 출력			
			parent.sumCount.setText(String.valueOf(parent.list.size())+"개");
			parent.sumPrice.setText(String.valueOf(parent.sum)+"원");

			System.out.println("C>"+parent.taMenu.getText());
		}
		
	}//showUp

	//총합계 계산 메소드
	void calSum(String price) {
		int index = price.indexOf("원");
		if(index ==-1)
		{parent.sum += Integer.parseInt(price);	// 가격 String배열의 숫자만 계산하여 sum에 저장
		return;
		} else
		{parent.sum += Integer.parseInt(price.substring(0, index));
		}
	}//calSum
	
}

/*
 * 짜장면 - 7,000원 짬뽕 - 9,000원 굴짬뽕 - 11,000원 탕수육 - 17,000원 팔보채 - 28,000원 해물 누룽지탕 -
 * 32,000원 칠리새우 - 21,000원 꿔바로우 - 18,000원 멘보샤 - 22,000원
 * 
 */
