package basic2;

import java.util.Scanner;

/*
 * for		: 반복횟수가 정해진 경우
 * while	: 반복횟수를 모르는 경우	
 * do~while	: 반복횟수를 모르는 경우(조건을 나중에 비교)
 */

public class Ex02_반복문구문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 구구단의 단수를 입력받아 해당 단의 구구단을 출력

		// 1. for문 
		/*System.out.println("몇 번 반복을 할까요?");							//ctrl + i는 라인 정리
		int su = sc.nextInt();
		System.out.println("=====구구단 중 원하는 단수를 입력하세요=====");
		int i = sc.nextInt();
		for(int n=0; n<su ; n ++) {
		
			for(int j=1 ; j<=9; j++) {
				// int k =i*j;
				// System.out.println(i+"*"+j +"=" + k);
				System.out.printf("%d * %d = %d\t\n", i, j , i*j);
			}
		}*/

		/*System.out.println("=====구구단 중 원하는 단수를 입력하세요=====");
		int i = sc.nextInt();
			for(int j=1 ; j<=9; j++) {
				// int k =i*j;
				// System.out.println(i+"*"+j +"=" + k);
				System.out.printf("%d * %d = %d,\t", i, j , i*j);*/
		
		//2. while
		/*while(true) {

			System.out.println("=====구구단 중 원하는 단수를 입력하세요=====");
			int s = sc.nextInt();
			for(int j=1 ; j<=9; j++) {
				// int k =i*j;
				// System.out.println(i+"*"+j +"=" + k);
				System.out.printf("%d * %d = %d\t\n", s, j , s*j);
			}
			System.out.println("반복을 종료(Y)");
			sc.nextLine(); //엔터기능
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("Y"))break;
			
			
		}*/

		
		//3. do ~ while
		Boolean run = true;
		int j=1;
		do {
			System.out.println("=====구구단 중 원하는 단수를 입력하세요=====");
			int s = sc.nextInt();
				for(j=1 ; j<=9 ; j++) {
					System.out.printf("%d * %d = %d\t\n", s, j , s*j);
				}System.out.println("계속 하시겠습니까");
			sc.nextLine(); //엔터기능
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("Y")){
				continue;
			}else if(answer.equalsIgnoreCase("N")) {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}while(run);
			
		}
	}




