package basic3;

public class Ex01_함수1 {

	public static void main(String[] args) {		//반복적인 작업이 띄엄띄엄 있을때 쓰는게 함수
		int a = 10, b = 20;
		
		add(a,b); 								
		

	}

	static void add(int a, int b) {				// add(int a, int b) : 파라미터, 위의 add를 받는 값
												// 이름을 다르게할 수도 있는데 헷갈리는 경우를 대비해서 동일하게 설정
		//여기에서 a,b 값을 합해서 출력
		int sum = a+b;
		System.out.println("합 : " + sum );
		
		
	}
	
	
}
