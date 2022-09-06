package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		// 에스프레소,  카페라떼, 아포카토 주문할 : 3,500원
		// 아메리카노를 주문할 경우 : 2,500
		// 그외의 메뉴를 출력할 경우 : 우리 매장에 없는 메뉴입니다.
		
		//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
		//		우리 매장에 없는 메뉴입니다.
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("주문하실 음료를 입력해주세요>>>");
	String order = sc.next();
	
	/*	int price1;
		int price2;
			
	
	
	if (order.equals("아메리카노")) {
		price1 = 2500;
		System.out.printf("주문하신 %s 의 가격이  %d원 입니다.", order, price1);
		}else if(order.equals("에스프레소")) {
		price2 = 3500;
			System.out.printf("주문하신 %s 의 가격이  %d원 입니다.", order, price2);
		}else if(order.equals("카페라뗴")) {
		price2 = 3500;
			System.out.printf("주문하신 %s 의 가격이  %d원 입니다.", order, price2);
		}else if(order.equals("아포카토")) {
			price2 = 3500;
			System.out.printf("주문하신 %s 의 가격이  %d원 입니다.", order, price2);
	}else {
			System.out.printf("우리 매장에는 없는 메뉴입니다.");
	}
	
	sc.close(); 	//메모리에서 객체 삭제.	
	*/
	
	int price;
	
	if(order.equals("에스프레소") || order.equals("카페라떼") || order.equals("아포카토")) {
		price = 3500;
		System.out.printf("주문하신 %s의 가격이  %d원 입니다.", order, price);
	}else if(order.equals("아메리카노")) {
		price = 2500;
		System.out.printf("주문하신 %s의 가격이  %d원 입니다.", order, price);
	}else {
		System.out.printf("우리 매장에는 없는 메뉴입니다.");
		
	}	
	
	sc.close(); 	//메모리에서 객체 삭제.
		
		
		

	}

}
