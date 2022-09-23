package polymorphism;

import java.util.Scanner;

public class polymorphism {

	public static void main(String[] args) {

			Item i = null;
			
			System.out.println("해당하는 물품번호 (1. 책, 2. DVD, 3.CD)");
			Scanner input = new Scanner(System.in);
			int sel = input.nextInt();
			
			switch(sel) {
			case 1 : i =new Book("001","사피엔스", "하라리", "코스모출판"); break;
			case 2 : i =new Dvd(); break;
			case 3 : i =new Cd(); break;
			}
				
			i.output();
			
	}

}
