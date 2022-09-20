package basic2;

public class Ex01_while개념 {

	public static void main(String[] args) {

		// 0. for 문
		int sum =0;
		for(int i=1 ; i<=10 ; i++) {	//1부터 10까지 1씩 증가하면서 출력
			sum +=i;					//지역변수(int sum;)는 초기화할 수 없다. 
		}System.out.println(sum);
		
		
		// 1. while 문
		int i=1;						// 초기값 선언을 반드시 while 밖에서 선언을 해야한다.
		int sum1 =0;				
		while(i<=10) {
			sum1+=i;
			i++;						// 증가값은 while 내에서 선언을 함.
		}System.out.println(sum1);
		
		// 2.do ~ while 문				//우선 실행을 한 후에 조건을 비교후 실행; 조건이 true일 경우 계속 실행
		int j=1;						// 
		int sum2 =0;				
		do {
			sum2+=j;
			j++;						// 
		}while(j<=10) ;
		System.out.println(sum2);
		
		
		
		
	}

}
