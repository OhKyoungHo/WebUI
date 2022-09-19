package basic1;

/*
 반복문 : for / while / do~while
  (1) for(초기치 ; 조건문; 증가치){
  			반복구문}
 */

public class Ex03_for개념 {

	public static void main(String[] args) {

		//1) 1부터 10까지 숫자 출력
		for(int i=1; i<=5 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1. 위의 for 원리 이해하기
		//2. 1부터 10까지의 합을 출력
		int sum=0;
		for(int i=1; i<=10 ; i++) {
			sum=sum+i;
		}System.out.println(sum);
		//3. 1부터 10까지의 홀수의 합을 출력
		int sum1=0;
		for(int i=1; i<=10 ;i++) {
			if(i%2==1) {
				sum1=sum1+i;}
		}System.out.println(sum1);
		//2) 'A'부터 'Z'까지 출력
		/*for(char a= 'A' ; a<='Z' ; a++ ) {
			System.out.print(a + " ");
		}
		System.out.println();
		for(char a= 'A' ; a<='Z' ; a+=2 ) {
			System.out.print(a + " ");
		}
		System.out.println();
			//'Z'부터 'A'까지 출력
		for(char a = 'Z'; a>='A' ; a--) {
			System.out.print(a +" ");
		}*/
		
		
		
		
		
		
	}

}
