package basic3;

import java.util.Scanner;

public class Today_Test03 {

	static void multiple(int a, int b) {					
		int mul = a*b;
		System.out.println("[출력결과] :" + mul);
	}

	static void multiple(int c, char d) {
		System.out.print("[출력결과] :" );
		for(int i=0 ; i<c ; i++) {
			System.out.print(d +" ");
		}System.out.println();
	}

	static void multiple(int e, int f, char g) {					
		for(int i=0 ; i<e ; i++) {
			for(int j=0 ; j<f ; j++) {
				System.out.print(g +" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		System.out.println("정수 a,b를 입력하세요");
		int a = input.nextInt();
		int b = input.nextInt();
		multiple(a,b);
		System.out.println("정수 하나, 문자 하나를 입력하세요");
		int c = input.nextInt();
		char d = input.next().charAt(0);
		multiple(c,d);
		System.out.println("정수 두개, 문자 하나를 입력하세요");
		int e= input.nextInt();
		int f = input.nextInt();
		char g = input.next().charAt(0);
		multiple(e,f,g);
	}

}
