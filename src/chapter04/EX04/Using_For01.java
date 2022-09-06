package chapter04.EX04;

public class Using_For01 {

	public static void main(String[] args) {
		
		/*
		 for (초기값 ; 조건 ; 증가값) {
		 	 실행문1;				← 조건이 '참'일 동안 계속 반복, '거짓'이면 for을 빠져나옴
		 }
		 
		 */
		
		
		
		
		
		int a ;									//변수 선언
		for (a = 0 ; a < 3 ; a++) {				// (초기값 ; 조건 ;  증가값)
			System.out.println(a);				//a에 0을 대입 , 0으로 출력, 출력된 값에 1을 증가, 증가시킨 값을 조건에 확인, 조건을 만족하면 출력, 해당 과정을 반복을하다 조건을 만족하지 않으면(false인 경우) 탈출	
		}	// 0 1 2
		
		System.out.println("==================");
		
		
		// 초기값과 증가값에는 ,로 구분해서 여러개의 변수가 올 수 있다.
		
		int b, c, d;
		for(b=0, c=10, d=20; b<5 ; b++, c+=2, d+=5) {			//5번반 반복(0,1,2,3,4), c+=2 는 c=c+2
			// b : 1씩 증가, c : 2씩 증가, d :5씩 증가,  
			System.out.println("b : " + b +", c: " +c+", d: "+ d);
		}
		
		System.out.println("========================");
		
		//for 문에서 무한루프(조건이나 증가값을 잘못 처리할 경우) 
		int e;
		for( e = 0 ; e < 10 ; e += 3 ) {
			System.out.println(e);			//조건이 True일 동안 반복
		}		// 0 3 6 9
		
		System.out.println("===== for문 없이 : 1 ~ 10까지 덧셈=====");
		//1부터 10까지 for 문 없이 덧셈
		
		int sum1 ;
		sum1 = 0;			// sum1 = sum1 + 0								   // 0
		sum1 += 1;			// sum1 = sum1 + 1(기존의 sum1에 1을 더한값을 변수에 넣는다) // 1
		sum1 += 2;			// sum1 = sum1 + 2								   // 3	
		sum1 += 3;			// sum1 = sum1 + 3								   // 6	
		sum1 += 4;			// sum1 = sum1 + 4								   // 10
		sum1 += 5;			// sum1 = sum1 + 5								   // 15
		sum1 += 6;			// sum1 = sum1 + 6								   // 21
		sum1 += 7;			// sum1 = sum1 + 7								   // 28
		System.out.println(sum1);
		sum1 += 8;			// sum1 = sum1 + 8								   // 36
		sum1 += 9;			// sum1 = sum1 + 9								   // 45
		sum1 += 10;			// sum1 = sum1 + 10								   // 55
		System.out.println("1~10까지의 합 : " + sum1);
		
		//for 문을 사용해서 1부터 10까지의 합계 구하기
		
		int sum2 ;
		int i ;
		for(i =1 , sum2 =0 ; i <= 10 ; i++ ) {
			sum2 += i;					//sum2 = sum2 + i;
			System.out.println("sum2 : " + sum2 + ", i : " + i);
		}
		System.out.println("1부터 10까지의 합계 : " + sum2);
		
		
		//for 문을 이용해서 0~1000 까지 7의 배수의 합계
		//출력 "7의 배수의 합계 : "
		int sum3;
		int z;
		for(z=0, sum3=0 ; z<=1000; z++ ) {
			if(z%7==0)			
			sum3 += z;
		}
		System.out.printf("7의 배수의 합계 : %d \n ", sum3);			//if문을 넣어서 출력
		
		
		int sum44=0;
		
		for(int w =0 ; w <=1000 ; w +=7) {
			sum44 +=w;
		}
		System.out.println("0~1000까지 7의 배수의 합계 : " + sum44);
		
		
		//for 문과 if문을 사용해서 1~10까지 더한 값을 출력하되 아래와 같이 출력하세요.
		// 결과 : 1+2+3+4+5+6+7+8+9+10 = 55
		
		int sum4=0;
		int h;
		for( h=1; h<=10 ; h++ ) {		
			System.out.print(h);			//1부터 10까지 수를 출력해낸다.
			if(h<10) {
				System.out.print("+");			//각수에다가 +를 붙여주면서 출력 1+,2+,3+...이런식으로
			}
			sum4+=h;							// sum4 = sum4+ h
		}
		System.out.printf("=%d ",sum4);
		//System.out.println("결과 : 1+2+3+4+5+6+7+8+9+10 =" + sum4);
		
		
		int sum33 = 0;
		for( int ii=1; ii<=10 ; ii++ ) {		
			sum33+=ii;	
			System.out.print(ii);			//더하는 수 출력
			if(ii<=9) {
				System.out.print("+");		//1~9까지 는 + 출력
			}else {
				System.out.print("=");		//i 가 10인 경우 출력
				System.out.print(sum33);
			}
	}

	}}
