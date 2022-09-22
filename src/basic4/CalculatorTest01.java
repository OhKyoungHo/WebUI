package basic4;

import java.util.Scanner;

public class CalculatorTest01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String g = "";
		CalculatorExpr01 h= new CalculatorExpr01(); 
		int count =0;
		
		
		while(true) {
			System.out.println("정수 2개를 입력하세요.");
			int num1 =  input.nextInt();
			int num2 = input.nextInt();
			
			h.setNum1(num1);
			h.setNum2(num2);
			if(count >0) 
			System.out.println("추출된 숫자는 " + num1 + "," +num2 +"입니다.");
			h.output();
			System.out.println("계속하시겠습니까?(Y/N), 끝낼려면 N 입력");
			g=input.next();
			
			if(g.toLowerCase().equals("n")) {break;}
			count++;
		}
		
		System.out.println("프로그램은 종료되었습니다.");
		
	}

}
