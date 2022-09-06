package chapter03.EX06;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		// 대입 연산자의 축약 표현
		/*
		 * 	산술연산의 축약 표현
		  	a= a + b		a += b	// a라는 변수에 b를 더해서 a에 넣는다
		 	a= a - b		a -= b	// a라는 변수에 b를 빼서 a에 넣는다
		 	a= a * b		a *= b	// a라는 변수에 b를 곱해서 a에 넣는다
		 	a= a / b		a /= b	// a라는 변수에 b를 나눠서 a에 넣는다
		 	
		 	비트연산의 축약 표현
		 	a= a & b		a &= b	// a&b한 값을 변수 a에 넣는다
		 	a= a | b		a |= b 	// a |b한 값을 변수 a에 넣는다 
		 	
		 	쉬프트 연산의 축약 표현
		 	a= a>>b		a>> = b		//a를 왼쪽으로 b만큼 쉬프트 이동한 값을 a에 넣는다
		 	a= a<<b		a<< = b		//a를 오른쪽으로 b만큼 쉬프트 이동한 값을 a에 넣는다
		 	
		 	논리 쉬프트
		 	a = a>>> b	a>>> = b
		 */
		int value1 = 3;
		value1 = value1 + 3;		//대입연산자는 최하위 연산자이기때문에 제일 나중에 적용
									// 3+3을 해서 value1에 넣어서 출력
		System.out.println(value1);
		System.out.println("=========================");
		
		int value2;		// 변수 선언
		value2 = 1;		// 변수에 값 할당
		System.out.println(value2 += 2);		//value2 = value2 + 2
					// 해당 출력 값은 3
		System.out.println(value2 -= 2);		//value2 = value2 - 2
					// 해당 출력 값은 위의 값 3을 넣어서 3-2 = 1
		System.out.println(value2 *= 2);		//value2 = value2 * 2
					// 해당 출력 값은 위의 값 1을 넣어서 1*2 = 2
		System.out.println(value2 /=2);			//value2 = value2 / 2
					// 해당 출력 값은 위의 값 2를 넣어서 2/2 = 1
		System.out.println(value2 %=2); 		//value2 = value2 % 2	
					// 해당 출력 값은 위의 값 1을 넣어서 1%2 = 1
		System.out.println(value2 <<=2); 		//value2 = value2 << 2
					// 해당 출력 값은 0000 0001을 왼쪽으로 2 이동 0000 0100 → 4, 1 * 2^2 = 4
		System.out.println(value2 >>=2); 		//value2 = value2 >>2
					// 해당 출력 값은 0000 0100을 오른쪽으로 2 이동 0000 0001 → 1, 4 *2^-2 = 1
		
	
	}
}
