package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		// switch 문으로 처리
		// 에스프레소,  카페라떼, 아포카토 주문할 : 3,500원
		// 아메리카노를 주문할 경우 : 2,500
		// 그외의 메뉴를 출력할 경우 : 우리 매장에 없는 메뉴입니다.
				
		//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
		//		우리 매장에 없는 메뉴입니다.
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 주문할 음료를 선택해주세요.");
		String order = sc.next() ;
		int price = 0 ;
		
		switch(order) {
		case "에스프레소" : case "카페라떼": case "아포카토":
			price = 3500;
			System.out.printf(" 당신이 주문한 %s의 가격은 %d 입니다.", order, price);
			break;
		case "아메리카노":	
			price = 2500;
			System.out.printf(" 당신이 주문한 %s의 가격은 %d 입니다", order, price);
			break;
		default :
			System.out.printf("우리 매장에는 없는 메뉴입니다");
		
		}
		sc.close();
		
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 주문할 음료를 선택해주세요.");
		String order = sc.next() ;
		int price = 0 ;
		
		switch(order) {
		case "에스프레소" : case "카페라떼": case "아포카토":
			price = 3500;
			break;
		case "아메리카노":	
			price = 2500;
			break;
		default :
			System.out.printf("우리 매장에는 없는 메뉴입니다.");
		}
		
		System.out.printf(" 당신이 주문한 %s의 가격은 %d 입니다.", order, price);
		sc.close();
		//해당식으로 하면 마지막 부분에만 출력문을 넣음으로써 switch문이 위의 switch 문보다 더 간단해지고 보기 쉬어짐, 
		
	}

}
