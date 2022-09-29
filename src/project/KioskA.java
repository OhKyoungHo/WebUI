package project;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KioskA extends JPanel{
   
   //객체 생성
   JPanel p = new JPanel();
   
   JButton[] kBtn = new JButton[9];                     //메뉴 버튼 구성
   JLabel[] kMenu = new JLabel[9];                        //메뉴 입력 Label
   
   String[] menuName = {"라멘","우동","야끼소바","텐동",
	         "돈카츠","가라아게","타코야끼","스시","유부초밥"};         //메뉴 이름 배열
	   
	   String[] price = {"7000원","7500원","8000원","8000원","8500원","8500원",
	         "9000원","12000원","6000원"};                  //메뉴 가격 배열


   MainTest parent;
   
   
   
 
   
   public KioskA(MainTest mainTest) {
      parent = mainTest;
      //메뉴 버튼 생성
      for(int i=0;i<kBtn.length;i++) {
         String imgSrc = "src\\project\\imgs\\"+String.valueOf(i)+".PNG";
         
         String name = menuName[i] +" / "+ price[i];            // 메뉴이름 + 가격을 동시에 나타냄
         
         ImageIcon icon = new ImageIcon(imgSrc);               
         Image resizeImage = imageResize(icon, 200, 150);    // 이미지 크기 조절
         kBtn[i] = new JButton(name, new ImageIcon(resizeImage));// 버튼에 메뉴와 아이콘 삽입
         kBtn[i].setBackground(new Color(255,255,255));		// 버튼 배경, 폰트 변경
		kBtn[i].setFont(new Font(null,Font.BOLD, 15));
         kBtn[i].setHorizontalTextPosition(JButton.CENTER);      // 수직으로 정렬
         kBtn[i].setVerticalTextPosition(JButton.BOTTOM);      // 글씨를 아래쪽에 놓음
      }//for
      
      
      addLayout();
      eventProc();

   }//end of KioskA
   
   void addLayout() {
      setLayout(new GridLayout(3, 3));   // 3행 3열 그리드
      
      setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
      
      for(int i=0;i<kBtn.length;i++) {            // 그리드에 맞춰 버튼 추가
         add(kBtn[i]);
      }//for
      
   }//addLayout()
   
    void eventProc() {
       
       //메뉴 버튼을 눌렀을 때
       for(int i=0;i<kBtn.length;i++) {
          kBtn[i].addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e) {
                // 이벤트가 발생한 컴포넌트의 참조를 얻어옴.
                JButton eBtn = (JButton)e.getSource();
                String[] strArr = eBtn.getText().split(" / ");
                inputData(strArr); //PayVO에 입력값 넘기기
                clearTA();         
                showUp();         //ta 에 주문 내용 출력하기
            }//end of actionPerformed
         });//end of addActionListener
       }//for
       
       //전체취소 버튼을 눌렀을 때
       parent.cancel.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
             parent.list.clear();
             clearTA();
          }//end of actionPerformed
       });//end of addActionListener
       
    }//eventProc
   
   //버튼에 들어갈 아이콘 이미지 크기 변환 메소드
   Image imageResize(ImageIcon icon, int x, int y){
      Image image = icon.getImage();//아이콘에서 이미지를 불러옴
      Image resizeImage = image.getScaledInstance(x,y,java.awt.Image.SCALE_SMOOTH); //이미지 화질을 최대한 보존하면서 크기 조정
      return resizeImage;//크기 조정된 이미지 반환
   }
   
   void inputData(String[] strArr) {
      PayVO p = new PayVO();
      
      p.setMenu(strArr[0]);
      p.setPrice(strArr[1]);
      p.setCount(p.getCount()+1);

      parent.list.add(p);
   }
   
   void clearTA() {
      //각 TextArea의 내용을 비움
      parent.taMenu.setText(null);
      parent.taPrice.setText(null);
      
      //최종 금액, 개수 초기화
      parent.sum = 0;
      parent.sumCount.setText(String.valueOf(parent.list.size())+"개");
      parent.sumPrice.setText(String.valueOf(parent.sum)+"원");
   }
   
   void showUp() {
      String input = null;
      for(PayVO vo : parent.list) {
         input = vo.toString();
         String[] arr = input.split("/");
         parent.taMenu.append(arr[0]+"\n");
         parent.taPrice.append(arr[2]+"\n");
         calSum(arr[2]);
         parent.sumCount.setText(String.valueOf(parent.list.size())+"개");
         parent.sumPrice.setText(String.valueOf(parent.sum)+"원");
      }
   }//showUp

   void calSum(String price) {
      int index = price.indexOf("원");
      parent.sum += Integer.parseInt(price.substring(0, index));
   }
   
}