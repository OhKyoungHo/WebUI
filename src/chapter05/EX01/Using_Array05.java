package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1~500 까지의 3의 배수를 배열에 저장
		// 출력 : 1. 직접 출력, 2. for 출력, 3.Enhanced For, 4. toSring()
		// 합계 :		평균 :

		

		int[]a = new int [166];
		
		a[0] = 3;
		a[1] = 6;
		a[2] = 9;
		a[3] = 12;
		a[165] = 498;
		
		System.out.println("=====1. 직접 출력=====");
	
		System.out.println(a[165]);		//index (방번호 0)
		
		System.out.println("=====for를 사용해서 값을 입력, 출력=====");	
		System.out.println(a.length);
		for(int i=0, j=3 ; i<a.length ;  i++, j+=3) {
			a[i]=j ;
			System.out.print( a[i] + " " );
			} System.out.println();
		
		
		System.out.println("=====향상된 for 문을 사용해서 출력=====");
		
		for(int k : a) {
			System.out.print(k +" ");
		}
		System.out.println();
		
		System.out.println("===== Arrays. toString() 문을 사용해서 출력=====");
		System.out.println(Arrays.toString(a));
		
		System.out.println("===== 합계와 평균 출력=====");
		int sum =0;
		int count =0;
		for(int i=0, j=3 ; i<a.length ;  i++, j+=3) {
			a[i]=j ;
			sum +=j; 
			count++;
			} System.out.println();
		System.out.println("합계는 " + sum +"이고, 평균은 " + sum/(double)count+ "입니다.");
		
	}

}
