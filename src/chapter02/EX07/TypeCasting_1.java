package chapter02.EX07;

public class TypeCasting_1 {

	public static void main(String[] args) {
		// 1. 캐스팅 방법
		//	- 캐스팅 방법 1 (테이터 타입을 명시)
		int value1 = (int)5.3;		// 5 //doule은 int로 자동으로 다운캐스팅 x-> 직접 캐스팅해야한다.
		long value2 = (long)10;		// int 10이 long 타입으로 자동으로 업캐스팅
		float value3 = (float)5.8;	// double 5.8을 float 타입으로 다운캐스팅
									// double은 float으로 자동으로 다운캐스팅 되지 않기 때문에 명시해줘야 한다.
		double value4 = 16;			// int 16을 double 타입으로 업캐스팅
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//	- 캐스팅 방법 2 (L,F)
		// 정수는 리터럴(변수에 들어가는 값) 이 기본이 int, 실수는 리터럴 이 기본이 double
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	

		
	}

}
