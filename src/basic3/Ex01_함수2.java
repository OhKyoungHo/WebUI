package basic3;

public class Ex01_함수2 {

	public static void main(String[] args) {

		int sum = add(); 		//
		// 합을 여기서 출력
		System.out.println(sum);
		
	}
	
	static int add() {			//반환하는 자료형에 대해서 입력(void -> int)
		int a =10, b=20;
		int sum = a+b;
		return sum;
	}
	

}
