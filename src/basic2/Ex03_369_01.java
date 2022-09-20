package basic2;

import java.util.Scanner;

public class Ex03_369_01 {

	public static void main(String[] args) {
		
		int count=0;
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		 int w = input.nextInt();

			for(int i=1 ; i<=w ; i++) {
			
				int su =i;
				boolean su369 = false;
			
				while(su!=0) {
					int na = su % 10;
			
				if(na==3 || na==6 || na==9) 
				{
					su369 = true;
				}
				su= su/10;
			}	
			
			if(su369) {
				System.out.print(i);
				
				count++;
	            if(i==w)break;
	            System.out.print(","); 
			}
			
			
		} System.out.print("에 숫자 3,6,9가 포함되어 총" + count+ "회 손벽을 칩니다.");
	
	
	
	}

}
