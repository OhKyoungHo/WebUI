package chapter04.EX05;

import java.util.Scanner;

public class Using_While02 {

	public static void main(String[] args) {
		// "그만" 할때까지 정수값을 넣어서 합계와 평균을 출력
		//
	/*	
	Scanner sc = new Scanner(System.in);

	int count = 0;			//정수가 입력되는 갯수를 카운트함.<평균>
	int sum = 0;			//입력 받은 정수를 모두 더한 값
	String str = "그만";
	int a=0;
	
	System.out.println("원하는 정수를 입력하세요. 마지막에 그만으로 종료를 알리세요.");
	int n = sc.nextInt(); 	//콘솔에서 정수값을 입력 받아 n 변수에 할당
	a = Integer.parseInt(str);
	System.out.println(a);
	// 반복횟수를 알 수 없는 경우 : while
	while(n != a ) {		//입력받은 정수값이 -1이 아니면 while 문을 실행
		sum +=n ;			// sum = sum + n;
		count++;			//정수 값을 count함.
		n = sc.nextInt();	//-1이 정수 값으로 input이 되면 루프를 빠져나온다.
		a = sc.nextInt();
	}
	if (count==0) {			//제일 처음에 정수값을 -1
		System.out.println("입력된 정수가 없습니다.");
	}else {					//정수값을 하나이상 넣은 경우
		System.out.println("입력된 정수는 : " + count + " 개입니다.");
		System.out.println("입력된 정수의 합은 : " + sum + "입니다.");
		System.out.println("평균은 : " + sum/(double)count);
	}
	*/
		
	//"그만" 할때까지 정수값을 넣어서 합계와 평균을 출력
	// 힌트 : 문자열을 정수로 변환
	//1. String s = sc.nextline(); 인풋 받는다
	//2. s.split("") ; ← 공백을 기준으로 잘라서 배열에 저장
	//3. 문자형 String 을 정수형으로 변환,Integer.ParseInt()
	//4. 합계와 평균을 구하면 됩니다.
	
	
	Scanner sc = new Scanner(System.in);
	
	String s;					//변수선언
	
	do {
		System.out.println("정수를 입력해주세요(종료를 원할시, 그만 입력>>>>");
		s = sc.nextLine();
		if(s.equals("그만")) {break;}
		String [] arr ;
		arr = s.split(" ");
		int f =0;
		int sum =0;
		int count=0;
		for(int i=0 ; i<arr.length ; i++) {
			if(i%1==0) {
				f=Integer.parseInt(arr[i]);
				sum +=f;
				count++;
			}
		}
		System.out.println("정수의 갯수 : " + count);
		System.out.println("정수의 합 : " + sum);
		System.out.println("정수의 평균 : " + sum/(double)count);
		
	}while(true);
	System.out.println("프로그램을 종료합니다.");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	}


