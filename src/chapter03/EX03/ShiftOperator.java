package chapter03.EX03;

public class ShiftOperator {

	public static void main(String[] args) {
		// 산술 시프트 (<<, >>) 
		//	- 부호비트는 고정되어 있다.
		//	- 대량의 계산을 빠르게 처리할 수 있다.
		
		// <<	각 비트는 왼쪽으로 이동
		System.out.println(3 << 1);		//3* 2^1 = 6, 3을 2진수로 고친 0000 0011을 왼쪽으로 1 이동 하면 0000 0110이 됨
		System.out.println(3 << 2); 	//3* 2^2 = 12
		System.out.println(3<< 3); 		//3* 2^3 = 24
		
		System.out.println(-3<< 1); 	//-3*2^1 = -6
		
		// >>	각비트를 오른쪽으로 이동
		
		System.out.println(5>>1);		//5/2^-1 = 2, 5를 2진수로 고친 0000 0101를 오른쪽으로 1 이동하면 0000 0010이 됨
		System.out.println(5>>2); 		//5/2^-2 = 1
		
		//논리시프트(>>>) 오른쪽으로만 이동 가능
		System.out.println(3>>>1);
		
		

	}

}
