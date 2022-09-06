package chapter04.EX02;

import java.util.Scanner;

public class UsingScanner_if {

	public static void main(String[] args) {
		// 문제 : Scanner로 정수값을 인풋 받아서 국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋받습니다.
		// if 문을 사용해서 평균이 90점 이상 : "A 학점", 80점 이상 : "B학점"
		// 70점 이상 : "C학점", 60점 이상 : "D학점", 나머지 : "F학점"
		
		Scanner sc = new Scanner(System.in);
		/*		
		System.out.println("국어(정수), 영어(정수), 수학(정수), 과학(정수), 음악(정수)" + " 공백으로 구분해서 점수를 입력하세요.>>>");
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		int cc = sc.nextInt();
		int dd = sc.nextInt();
		int ee = sc.nextInt();
		
		System.out.println("당신의 점수는 국어" + aa+ "이고, 영어는" + bb+ " 이고, 수학은" + cc +"이고, 과학은" + dd + "이고, 음악은" + ee + "입니다." );
		
		double avg = (aa +bb +cc + dd + ee)/5.0;
				
		if (avg>=90) {
		System.out.println("A학점입니다.");
		}else if  (avg>=80) {
		System.out.println("B학점입니다.");
		}else if  (avg>=70) {
		System.out.println("C학점입니다.");
		}else if  (avg>=60) {
		System.out.println("D학점입니다.");
		}else {
		System.out.println("미달입니다.");
		}
		
		System.out.println("if문 탈출됨");

*/
		
		System.out.println("국어점수를 입력하세요");
		int aa = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		int bb = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		int cc = sc.nextInt();
		System.out.println("과학점수를 입력하세요");
		int dd = sc.nextInt();
		System.out.println("음악점수를 입력하세요");
		int ee = sc.nextInt();
		
		double avg = (aa +bb +cc + dd + ee)/5.0;
		
		if (avg>=90) {
			//System.out.println("평균은 "+ avg +"입니다."+ "A학점입니다.");
			System.out.printf( "평균은 %.2f이고, A학점입니다.",avg);
			}else if  (avg>=80) {
			System.out.printf("평균은 %.2f이고, B학점입니다.",avg);
			}else if  (avg>=70) {
			System.out.printf("평균은 %.2f이고, C학점입니다.",avg);
			}else if  (avg>=60) {
			System.out.printf("평균은 %.2f이고, D학점입니다.",avg);
			}else {
			System.out.printf("평균은 %.2f이고, 미달입니다.",avg);
			}
			
			System.out.print("if문 탈출됨");

			
			sc.close(); 	//메모리에서 객체 삭제.
			
		}

/*
 		int aa, bb, cc, dd, ee;
 
 		aa = sc.nextInt();
		bb = sc.nextInt();
		cc = sc.nextInt();
		dd = sc.nextInt();
		ee = sc.nextInt();
		
		double avg = (aa +bb +cc + dd + ee)/5.0;
		
		if (avg>=90) {
		System.out.println("A학점입니다.");
		}else if  (avg>=80) {
		System.out.println("B학점입니다.");
		}else if  (avg>=70) {
		System.out.println("C학점입니다.");
		}else if  (avg>=60) {
		System.out.println("D학점입니다.");
		}else {
		System.out.println("미달입니다.");
		}
		
		System.out.println("if문 탈출됨");
		
 */
}
