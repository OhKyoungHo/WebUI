package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		// for 문 내의 if
		// 정수(음수, 양수) 을 스캐너로 5개 인풋 받아서
		// 양수만 더한 값을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		int a;
		int sum3=0 ;
		int sum4=0;
		int g;
		double avg1=0 ;
		System.out.println("정수 5개를 입력하세요");
		for(g=0 ; g<5; g++) {
			a = sc.nextInt();
			if(a>0) {
				sum3+=a;}
			sum4+= a;
			avg1=sum4/5.0;
			}
		System.out.println("양수만 더한 값 :" + sum3);	//하나의변수에 많은 역할을 부여하면 오류발생
		System.out.println("평균값 : " + avg1);
		
		sc.close();
		
		int sum = 0;
		int sum1 = 0;
		int count = 0;
		int count1 = 0;
		System.out.println(" 정수 5개를 입력 하세요(음수, 양수)");
		for(int i=0 ; i<5 ; i++) {
			int n = sc.nextInt();
			sum1 += n;
			count1++;
			if(n>0) {
				sum =+ n;
				count++;
			}
		}
		System.out.println("양수의 합 :" + sum + ", 양수의 평균 : " + sum / (double)count); 		//count는 숫자 입력을 한 횟수를 평균계산에 활용하기 위해서 사용
		System.out.println("모든 수의 합 : " + sum1 + ", 모든 수의 평균 " + sum1/ (double)count1);
		
		sc.close();
	}
	
	
}
