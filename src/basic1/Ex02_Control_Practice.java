package basic1;

import java.util.Scanner;

public class Ex02_Control_Practice {

	public static void main(String[] args) {
		// 
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("=====당신의 학번을 입력하세요=====");
		String studentID =input.nextLine();
		String col = null;
		String maj =null;
		
		char an= studentID.charAt(4);
		String num = studentID.substring(5, 7);
		String year = studentID.substring(0, 4);
		
		boolean success = true;					//boolean을 넣어서 공대, 사회대 내에서도 오류가 났을 경우 '잘못입력하셨습니다'가 나오도록 설정
	
		if(an=='1') { col = "공대";
			switch(num) {
			case "11" : maj = "컴퓨터학과";break;
			case "12" : maj = "소프트웨어학과";break;
			case "13" : maj = "모바일학과";break;
			case "22" : maj = "자바학과";break;
			case "33" : maj = "서버학과";break;
			default : success = false;
			}
			
		}else if(an == '2') {
			col = "사회대";
			switch(num) {
			case "11" : maj = "사회학과";break;
			case "12" : maj = "경영학과";break;
			case "13" : maj = "경제학과";break;
			default : success = false;
			}
		}
		if(success) {
			System.out.println(studentID +"는" + year + "에 입학한 " + col +" "+ maj +"학생입니다." );
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
	
		

	}

}
