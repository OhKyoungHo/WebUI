package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		// 한국을 빛낸 5명의 위인들만 s String 배열에 저장 후 4가지로 출력
		
		System.out.println("=======직접 할당=======");
		String [] p = new String [5];
			
		p[0] = "이순신";
		p[1] = "유관순";
		p[2] = "안중근";
		p[3] = "강감찬";
		p[4] = "세종대왕";
		
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		
		System.out.println("=====for 문=====");
		for(int k =0 ; k<p.length ; k++) {
			System.out.println(p[k]);
		}
		System.out.println("======향상된 for 문=====");
		
		for(String k : p) {
			System.out.println(k);
		}
		System.out.println("=====Arrays.toString(p)====");
		
		System.out.println(Arrays.toString(p));
		
		
		
		
	}

}
