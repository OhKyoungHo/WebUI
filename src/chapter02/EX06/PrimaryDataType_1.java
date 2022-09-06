package chapter02.EX06;

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		
		// byte < short < int < long < float < double
		
		// 업캐스팅 : 자동으로 적용, 작은 데이터 타입에서 큰 데이터 타입으로 변환
		// 다운캐스팅 : 수동으로 적용, 큰 데이터 타입에서 작은 데이터 타입으로 변환
		
		//자바에서 = 왼쪽과 오른쪽은 반드시 데이터 타입이 같아야 한다.
			// byte, short는 예외로 적용됨.
		//int와 long는 같은 4byte 이지만 long의 범위가 더 크다!(생각)
		
		
		int a = 10 ;
		float b = 10.11F ;
		
		float c = a+b ;		//정수 a는 자동으로 float으로 업캐스팅
							//int와 float가 연산하게 되면 작은 데이터타입인 int가 업캐스팅 되어서 float으로 출력
		System.out.println(c);
		
		//int d = a + b;	//오류발생
		int d = a + (int)b;		// float b를 int b로 다운캐스팅
								//다운캐스팅의 경우는 수동으로 해야 하는데 해당 큰 데이터를 작은데이터에 맞게 캐스팅써줘야 함
		
		System.out.println(d);
		
		//boolean : true / false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);

		
		//정수 : byte, short, int, long
		// 기본값은 int 값으로 정의
		
		
		
		
		byte value1 = 10;		//오른쪽 값은 int, 만약 소숫점 있으면 double
		short value2 = -10;		//해당 경우는 다운캐스팅을 명시해줘야 하는데 예외적으로 자동으로 다운캐스팅되어 들어간다.
		int value3 = 100;
		long value4 = -100L;	//int 값이 Long 데이터 타입으로 업캐스팅 되어서 들어감
								//오른쪽에 있는 int 값이 변수 value4로 들어가는데 자동으로 업캐스팅되어 들어간다. 
		
		
				
	}

}
