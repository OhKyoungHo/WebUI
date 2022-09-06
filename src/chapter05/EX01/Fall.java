package chapter05.EX01;

import java.util.Scanner;

public class Fall {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 정수 10개를 입력하세요>>>");
		int r1= sc.nextInt();
		int r2= sc.nextInt();
		int r3= sc.nextInt();
		int r4= sc.nextInt();
		int r5= sc.nextInt();
		int r6= sc.nextInt();
		int r7= sc.nextInt();
		int r8= sc.nextInt();
		int r9= sc.nextInt();
		int r10= sc.nextInt();
		
		int[] r = new int[] {r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
		int max = 0;
		for(int i =0 ; i< r.length; i++) {
			System.out.print(r[i] + " ");
			{if (i < max) { max = r[i];}
			
			}
	
	
			System.out.println("배열방 10개에서 최대값은 : " + max);

	}

}
}
