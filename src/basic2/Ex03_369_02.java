package basic2;

import java.util.Scanner;

public class Ex03_369_02 {

	
		public static void main(String[] args) {
			//369
			Scanner sc = new Scanner(System.in);
			System.out.println("num을 입력하시오: ");

			int num = sc.nextInt();
			int count = 0;

			for(int i = 1; i <= num; i++) {
				int su = i;
				boolean su369 = false;
				while(su !=0) {
					int na = su %10;
					if(na ==3|| na ==6|| na ==9) {
						su369 = true;
					}//if
					su = su/10;
				}//while

				if(su369) {
					System.out.print("짝!");
					count+=1;
				}
				else {
					System.out.print(i+"-");
				}
			}//for

			System.out.println("\n손뼉 친 횟수는: "+ count);
		}//main

	}

