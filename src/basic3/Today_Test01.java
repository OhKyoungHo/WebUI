package basic3;

import java.util.Scanner;

public class Today_Test01 {

	static void checkLower(char inputdata) {

		if(Character.isUpperCase(inputdata)) {
			System.out.println("False");
	}else if(Character.isLowerCase(inputdata)) {
		 	System.out.println("True");
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("=====영문자를 입력하세요(ex:A)=====");
		char inputdata = input.next().charAt(0);
		
		 checkLower(inputdata);
	}
}
