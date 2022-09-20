package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("입력할 학생 수를 입력해주세요");
		int studentNum = sc.nextInt();

		sc.nextLine();

		String students[] = new String[studentNum];

		System.out.printf("%d명의 국어 영어 수학 점수를 받아 출력" +"\n",studentNum);

		System.out.println("");


		int kor = 0;
		int eng = 0;
		int mat = 0;




		for(int i = 0; i < students.length; i++) {
		System.out.print(i+1+"째 학생의 성적을 입력 -> ");
		students[i] = sc.nextLine();
		}
		for(int i = 0; i < students.length; i++) {
		StringTokenizer st = new StringTokenizer(students[i],"/");

		int sum = 0;
		int count = 0;

		while(st.hasMoreTokens()) {
		int num = Integer.parseInt(st.nextToken());
		sum += num;
		if(count == 0) {
		kor += num;
		}if(count == 1) {
		eng += num;
		}if(count == 2) {
		mat += num;
		}
		count++;
		}


		System.out.println(i+1+"번째 학생의 총점 "+sum +" 이고 평균은 "+sum/(double)count+" 입니다");
		}

		System.out.println("===============================");
		System.out.println("국어과목 총점 "+kor+" 이고 평균은 "+kor/studentNum+" 입니다");
		System.out.println("영어과목 총점 "+eng+" 이고 평균은 "+eng/studentNum+" 입니다");
		System.out.println("수학과목 총점 "+mat+" 이고 평균은 "+mat/studentNum+" 입니다");

		sc.close();
		}

	}


