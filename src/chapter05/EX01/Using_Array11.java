package chapter05.EX01;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// 탁구2, 야구10, 축구11, 농구5, 씨름2
		// 각 운동 종목의 구성원 수를 합과 평균
		// 
		
		String s;
		
		do {
			System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으세요>>>");
			s =sc.nextLine();
			
			String [] arr;
			arr = s.split(" ");
			for(int i=0 ; i<arr.length ; i ++) {
				System.out.print(arr[i] + " ");
			}System.out.println();
			
			int q ;
			int sum =0;
			int count=0;
			for(int i=0 ; i<arr.length ; i++) {
				if(i%2!=0) {
					q=Integer.parseInt(arr[i]);
					sum+=q;
					count++;
				}
			}
			if(s.equals("그만")) {
				break;
			}
			System.out.println("종목의 갯수 :" + count);
			System.out.println("구성원의 합 : " + sum );
			System.out.println("구성원의 평균 : " + sum/(double)count);
			
		}while(true);
		System.out.println("프로그램을 종료합니다.");
		
		
	}

}
