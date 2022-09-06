package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/* 1. 문제
		  		스캐너로 "Gold"를 넣으면 "금메달입니다"를 출력
		  		스캐너로 "Silver"를 넣으면 "은메달입니다"를 출력
		  		스캐너로 "Bronze"를 넣으면 "동메달입니다"를 출력
		  		그외는 "메달이 없습니다."
		  	2. 문제
		  		스캐너로 월을 인풋받아서 해당 월의 총 날짜를 
		  		"<월>은  <몇일>까지 있습니다."	
		  		31일 : 13578 10 12 30일 246911 28일 2
		 */
	
	Scanner sc = new Scanner(System.in);
	System.out.println("당신의 메달 색깔을 입력해주세요>>>");
	String color = sc.next();
	
	switch(color) {
		case"Gold" : case"gold" : case"GOLD" :
			System.out.println("금메달입니다.");
			break;
		case"Silver" : case"silver" : case"SILVER" :
			System.out.println("은메달입니다.");
			break;
		case"Bronze" : case"bronze" : case"BRONZE" :
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
	}
	
	
	/*
	System.out.println("========================");
	
	System.out.println("원하시는 달(月)을 입력해주세요(1~12)");
	int month = sc.nextInt();
	int day = 0;
	
	switch(month) {
		case 4: case 6: case 9: case 11:	
			day = 30;
			break;
		case 2:
			day = 28;
		default : 
			day = 31;
	}
	
	System.out.printf("%d월은 %d일까지 있습니다.",month, day);
	sc.close();
	*/
	System.out.println("원하시는 달(月)을 입력해주세요(1~12)");
	int month = sc.nextInt();
	
	switch(month) {
		case 1: case 3: case 5: case 7:	case 8:	case 10: case 12:		
			System.out.printf("%d월은 31일까지 있습니다.",month);
			break;
		case 4: case 6: case 9: case 11:	
			System.out.printf("%d월은 30일까지 있습니다.",month);
			break;
		case 2:
			System.out.printf("%d월은 28일까지 있습니다.",month);
		default : 
			System.out.println("해당 달(月)은 없습니다. 확인해주세요.");
	}
	sc.close();
	
	
	}

}



