package chapter03.EX07;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 삼항연산자 <-- 자주사용
		// (조건) ? 참:거짓 ;
		//		조건이 참이면 '참'을 실행, 조건이 거짓이면 '거짓'을 실행
		// 			: 	깃발
		
		int value1 = (3 > 5) ? 6:9;	//조건이 false이므로 변수 9가 할당
		System.out.println(value1);
		
		int value2 = (5 > 3) ? 10:20;
		System.out.println(value2); //조건이 true이므로 변수 10이 할당	
		
		int value3 = 3;
		System.out.println( (value3 % 2 ==0) ? "짝수" : "홀수");
		 	// % : 나머지 값만 출력
		
		// 5의 배수 인지 삼항 연산자를 통해서 확인
		
		int value4 = 10; 
		System.out.println( (value4 % 5 ==0) ? "5의 배수이다." : "5의 배수가 아니다.");
		

		//나이가 20이상이면 당신은 성인이다.  당신은 성인이 아니다.
		
		int value5 = 29;
		System.out.println( (value5 >= 20) ? "당신은 성인이다." : "당신은 성인이 아니다.");
		
		
		//삼항연산자는 if ~ else 문으로 변환 가능
		/*
		if ( 조건(true or false) ){ 
			실행문1; ← 조건이 참이면 실행문 1이 실행
		}else {
			실행문2; ← 조건이 거짓일때 실행문2가 실행
		};
		
		*/
		//변수 선언은 1번만 가능하다
		value3 =5;
		
		if (value3 %2 ==0) {
			System.out.println("짝수");				//조건이 참일때 실행 블락
		}else {
			System.out.println("홀수");				//조건이 거짓일때 실행 블락
		};
		
		// 5의 배수를 출력
		if(value4 %5 ==0) {
			System.out.println("5의 배수이다.");
		}else {
			System.out.println("5의 배수가 아니다.");
		};
		
		// 나이가 20살 이상이면 성인
		if (value5 >=20) {
			System.out.println("당신은 성인이다");
		}else {
			System.out.println("당신은 성인이 아니다");
		};
		
	
		
		
		
	}

}
