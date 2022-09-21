package basic3;

public class Ex02_멤버변수 {			//멤버 변수는 위의 함수와 같이 어떠한 값을 불러오는 것에 차이가 있다.

	static int a = 10, b = 20;
	static int sum = 0;
	
	
	public static void main(String[] args) {
		add();
		// 두 수 더한 결과를 출력
		System.out.println("합 : " + sum);
	}

	static void add() {
		// 두 수를 더하기
		sum =a+b;
		
		
	}
	
	
}
