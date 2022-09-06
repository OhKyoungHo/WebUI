package chapter02.EX09;

public class TypeCasting_3 {

	public static void main(String[] args) {
		
		//#1. 같은 자료형 간의 연산
		int value1 = 3 + 5;
		int value2 = 8/5;		//주의 : 나눗셈을 할 경우 int타입으로 정의되면 정확한 값이 출력되지 않을 수 있음. 
								//나누기 or 평균 적용할때 int로 하면 소숫점이 없어진다. float이나 double로 하는게 소숫점까지 표시할 수 있다 
		double value2_1 = 8/5;	//부정확한 값 출력(1.0) // 정수/정수 여서 정수값으로 표현(부정확한 값), int값으로 하면 부정확한 값이 출력될 수 있다
		double value2_2 = 8.0/5;	// 정확한 값 출력(1.6) // 실수/정수 여서 실수값으로 표현(정확한 값)
		
		float value3 = 3.0f + 5.0F;
		double value4 = 8.0 /5.0;
		
		//byte, short을 연산을 하면 정수(int)로 처리해야됨.
		byte data1 = 3;
		byte data2 = 5;
		
		short data3 = 7;
		short data4 = 9;
		
		
		// byte value5 = data1 + data3; //오류 발생됨
		int value5 = data1 + data2;		//byte, short 연산후 int 타입으로 처리되어야함
		int value5_2 = data3 + data4; 	
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value2_1);	//부정확한 값 출력 : 1.0
		System.out.println(value2_2);	//정확한 값 출력 : 1.6
		System.out.println(value5);
		System.out.println(value5_2);
		
		System.out.println("===============");
		
		//다른 자료형 간의 연산 ( 작은 자료형이 큰자료형으로 자동으로 업캐스팅되어 연산됨)
		
		//int value6 =  5 + 3.5 ; 	//오류발생 // 5가 5.0으로변환이 되어서 연산(double로 연산), 왼쪽이랑 맞춰주기 위해 오른쪽에 다운캐스팅 수동적용
		int value6 = (int) (5 + 3.5); // int로 다운캐스팅
		
				
		double value7 = 5 + 3.5 ;	//5가 double로 자동 업캐스팅됨
		int value7_1 = 5 + (int)3.5 ; //3.5가 double이라 다운캐스팅시켜서 앞에 (int) 넣어주면 오류없어짐

		double value8 = 5/2.0 ;
		byte data33 = 3;
		short data44 = 5;
		int value9 = data33 + data44;	//주의 : byte, short는 int로 처리
		double value10 = data33 + data44;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);		
		System.out.println(value7_1);
	
	}

}
