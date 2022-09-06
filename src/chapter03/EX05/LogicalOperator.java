package chapter03.EX05;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리연산자 ( &&: AND, ||: OR , ^:XOR , !: NOT)
		//	--연산자 좌측과 우측에는 true, false
		//	AND 연산 : && ← 좌우 모두 true 일때 true
		System.out.println(true && true);		//true
		System.out.println(true && false); 		//false
		System.out.println(true && (5>3)); 		//true
		System.out.println((5<=5) && (7>2)); 	//true
		System.out.println("===================");

		//	OR 연산 : || ← 좌우 중 하나만 true면 true
		System.out.println(true || true ); 		//true
		System.out.println(true || false); 		//true
		System.out.println(false || (5<3)); 	//false
		System.out.println((5<=5) || (7>2)); 	//true
		System.out.println("=========================");
		
		//	XOR 연산 : ^ ← 좌우중 동일할때 false, 다를때 true
		System.out.println(true ^ true); 		//false
		System.out.println(true ^ false);		//true
		System.out.println(false ^ (5<3));		//false
		System.out.println((5 <=5) ^ (7>2)); 	//false
		System.out.println("============================");
		
		//	NOT : ! ← 반대로 출력, false이면 true, true이면 false
		System.out.println(!true); 				//false
		System.out.println(!false); 			//true
		System.out.println(false || ! (5<3));	//true, (5<3)이 false !로인해 true , 둘중에 하나가 true이므로 true
		System.out.println( (5<=5) || ! (7>2)); //true
		System.out.println("===============================");
		
		//	비트연산자로 논리연산을 수행
		System.out.println(true & true); 		//true
		System.out.println(true & false); 		//false
		System.out.println(true | (5>3)); 		//true
		System.out.println((5<=5) | (7>2));  	//true
		System.out.println("============================");
		
		//숏 서킷 (short circuit) : 
		//	-- 왼쪽의 결과 값만으로 유추가능할때 오른쪽의 값을 실행하지 않는 것.
		//	-- 논리 연산자에서만 작동됨 (&&, ||, ^, !) 
		//	-- 비트연산자에서는 작동이 안됨 (&, |, ^, ~)
		
		//AND 연산에서 숏 서킷이 발생되는 예제
		//논리연산에서는 short circuit이 발생됨
		int value1 = 3;
		System.out.println(false && ++value1 > 6); 	//short circuit, 앞의 값이 이미 false이기 때문에 뒤의 값을 실행하지 않음
		System.out.println(value1);					//3, 위의 숏 서킷 때문에 증가연산이 실행되지 않아서 3으로 출력
		
		//비트연산은  short circuit이 발생 안됨
		int value2 = 3;
		System.out.println(false & ++value2 > 6); 	//모두확인(비트연산자이기 때문에 숏 서킷 발생x)
		System.out.println(value2);					//숏 서킷이 발생하지 않아서 값이 4로 출력 
		
		//OR 연산에서 숏 서킷이 발생되는 예제
		int value3 = 3;
		System.out.println(true || ++value3 > 6);	//short circuit, 앞의 값이 이미  true이기 때문에 뒤의 값을 실행하지 않음
		System.out.println(value3);					// 숏 서킷으로 인해 오른쪽 값이 실행하지 않아서 3으로 출력
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);	//비트연산자이기 때문에 숏 서킷 발생하지 않음
		System.out.println(value4);					
		
		
	
		
	}

}
