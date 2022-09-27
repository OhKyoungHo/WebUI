package d_calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalTest {



   // 1. 멤버 변수 선언
   JFrame f;
   JTextField tf;
   JButton []bNum = new JButton [10]; // 배열 0~9 까지 숫자표현
   JButton []bOp = new JButton [4]; // +, -, * / 연산자를 표현할 버튼들
   JButton bequal;
   
   int first,second ;					// 두 수 계산을 위한 변수 선언
   String op = ""; 					// 부호를 위한 변수 선언
   //int count = 0;
   //String third = "";
   //String longd = "";
   
   


   // 2. 객체 생성
   CalTest(){
      f = new JFrame("계산기");		//창제목
      bequal = new JButton ("=");	//"=" 버튼 만들기
      for(int i = 0; i < 10; i++) {	//반복문으로 버튼 배열에 값 배정
         String s = Integer.toString(i);	//int i 값을 String으로 바꿔줌 
         bNum[i] = new JButton(s);
      }
      
      tf = new JTextField("");
      bOp[0] = new JButton("+");
      bOp[1] = new JButton("-");
      bOp[2] = new JButton("*");
      bOp[3] = new JButton("/");

      
   }// end of CalTest()
   
   


   // 3. 화면 구성 및 화면 출력 
   void addLayout() {
      f.setLayout(new BorderLayout());	// 동/서/남/북/가운데 배치
      
      JPanel pSouth = new JPanel();		// 컴포넌트들을 그룹 별로 묶어서 처리할 때 사용하는 컨테이너
      f.add(pSouth    ,BorderLayout.SOUTH);		//버튼들을 남쪽으로 모아서 출력
      pSouth.setLayout(new GridLayout(5,3));	// 행,열에 맞춰 배치
      pSouth.setPreferredSize(new java.awt.Dimension(50, 200));
      
      for(int i = 1; i < 10; i++) {	// 반복문을 이용해서 화면에 버튼 추가
         pSouth.add(bNum[i]);
      }//for문 닫음
      pSouth.add(bOp[0]);	// 출력하고자하는 순서에 맞게 화면에 버튼 추가
      pSouth.add(bNum[0]);
      pSouth.add(bequal);
      pSouth.add(bOp[1]);
      pSouth.add(bOp[2]);
      pSouth.add(bOp[3]);
      
      // 화면에 텍스트 필드 추가
      f.add(tf);
      f.setBounds(100,100,600,350);// 크기지정
      f.setVisible(true);// 창을 화면에 나타낼 것인지 설정
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x 버튼을 누르면 콘솔 종료되도록 설정
   } // end of addLayout()
   
   
   // 4. 이벤트 처리 
   public void eventProc() {
	// 숫자 버튼이 눌렸을때
      for(int i = 0; i < bNum.length; i++) {	//이벤트 처리하는 클래스 생성, 단 반복되는 과정이 필요 
    	  										// → 반복문 형식으로 만듦
      bNum[i].addActionListener(new ActionListener()  {
         public void actionPerformed(ActionEvent f) {
            //이벤트가 발생한 컴포넌트의 참조값
            JButton fBtn = (JButton)f.getSource();
            String su = (tf.getText()+ fBtn.getText());	//처음에 입력하는 tf.getText()에 eBtn.getText()가 추가 입력
            											//한자리 수가 아닌 여러자리수 입력 가능
            tf.setText(su);
            }//end of actionPerformed

         }
      );   //end of addActionListener
      } //for문 닫음
            
   // 연산자 버튼이 눌렸을때
      for(int i = 0; i < bOp.length; i++) {	//이벤트 처리하는 클래스 생성, 단 반복되는 과정이 필요 → 반복문 형식으로 만듦
         bOp[i].addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent f) {	//변수명.getSource : 이벤트 리스너를 등록한 무언가를 실행할시 그 이벤트가 실행되는 
            												//특정 컨테이너의 모든 속성을 가져올 수 있다.
               JButton fBtn = (JButton)f.getSource();
               op = fBtn.getText();							// op는 부호
               first = Integer.parseInt(tf.getText());		// first는 int 값이기 때문에 String인 tf.getText()을 int로 바꿔줌
               												// 첫번째 입력한 수와 부호가 함께 있는 값이 나옴
               tf.setText("");								//reset
           													//없을 경우, 계산시 화면에 첫번째 수가 남고 뒤에 수는 계산 된 채로 남음	
            }//end of actionPerformed
         });  //end of addActionListener 
         }//for문 닫음
      
   // = 버튼이 눌렸을때
      bequal.addActionListener(new ActionListener()  {
         public void actionPerformed(ActionEvent f) {
            JButton fBtn = (JButton)f.getSource();
            second = Integer.parseInt(tf.getText());	//숫자로 계산해야 하기 때문에 String을 int로 변경
            switch(op) {								//op의 값에 따라 이동
            case "+" :  first +=second ; break;			//first와 second 계산한 값 출력
            case "-" :  first -=second ; break;
            case "*" :  first *=second ; break;
            case "/" :  first /=second ; break;
            }
            tf.setText(Integer.toString(first));
         }//end of actionPerformed
      });   //end of addActionListener
         }// end of eventProc
               

   public static void main(String[] args) {
      
      CalTest cal = new CalTest();
      cal.addLayout();	//화면 호출
      cal.eventProc();	//계산할 수 있는 메소드 호출


   }

}