package basic2;

import java.util.Scanner;

public class Ex04_성적 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int kor[] = new int[5];
		int sum=0;
		int count =0;
		for(int i =0 ; i<kor.length;i++) {
			System.out.println(i+1 + "번 학생의 국어 점수를 입력>>");
			kor[i] = input.nextInt();
			sum+=kor[i];
			count++;
		}
		//출력
		for(int i=0; i<kor.length; i++) {
			System.out.println(i+" 번 학생의 점수 : " + kor[i]);
			
		}System.out.println("위 학생들의 국어 점수의 총점은 " + sum +"이고 평균은 " + sum/(double)count + "입니다");
		
		// 위 학생들 점수의 총점과 평균을 입력
		
		

	}

}
