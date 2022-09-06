package chapter04.EX02;

import java.util.Scanner;

public class UsingScanner_if02 {
	
	public static void main(String[] args) {
		// 점수와 학년을 인풋 받아서 60점 이상이면 합격, 미만이면 불합격
		// 4학년인 경우 70점이면 합격, 중첩 if 문사용(if문 내에 if문)
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("점수를 입력하세요(0~100)>>>");
		int score = sc.nextInt();
		System.out.println("학년을 입력하세요(1~4)>>>");
		int year = sc.nextInt();
		
		if (score>=60) {
			if( year !=4 ) {
				System.out.println("당신은 합격입니다.");	 		//4학년 아니면 60점 이상이면 합격
				}else if(score>=70 ) {
					System.out.println("당신은 합격입니다.");		//4학년이고 70점 이상이면 합격
				}else  {
					System.out.println("당신은 불합격입니다.");	// 4학년이고 70점 이상이 아니면 불합격
				}
			}else {
				System.out.println("당신은 불합격입니다.");		//60점 미만이면 1,2,3,4 모두 불합격
	}
	sc.close();
	
		/*
		System.out.println("당신의 점수(정수)와 학년(정수)을 입력해 주세요>>>");		
		int score = sc.nextInt();
		int year = sc.nextInt();
		
		System.out.println("당신의 점수는 " + score +" 점이고, 학년은 " + year + "학년 입니다.");
		/*
		if (score>=60) {
			System.out.println("당신은 합격입니다.");
		}else if(score>=70 & year==4) {
			System.out.println("당신은 합격입니다.");
		}else if(score<60) {
			System.out.println("당신은 불합격입니다.");
		}
		
		sc.close(); 	//메모리에서 객체 삭제.
		 */

	
	
	
	
	
	
	
	}
	}

