package basic3;

import java.util.Scanner;

public class Today_Test02 {

	static void checkUpper(char inputdata) {
		
		if(Character.isLowerCase(inputdata)) {
			char alpha = Character.toUpperCase(inputdata);
			System.out.println(alpha);
	}else if(Character.isUpperCase(inputdata)) {
		 	System.out.println(inputdata);
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("=====영문자를 입력하세요(ex:A)=====");
		char inputdata = input.next().charAt(0);
		
		 checkUpper(inputdata);
	}

}
