package chapter04.EX02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문할 메뉴를 입력하세요.");
		System.out.println("에스프레소 카페라떼 아포카도 아메리카노");

		
		String order = sc.next();
		int price = 0;
		
		if(order.equals("에스프레소") || order.equals("카페라떼") || order.equals("아포카도")) {
			price = 3500;
			}else if(order.equals("아메리카노")) {
			price = 2500;
			}else {
				System.out.println("우리 매장에 없는 메뉴입니다.");
			}
			System.out.printf("주문하신 %s의 가격이 %d입니다.", order, price);
		
	}

}
