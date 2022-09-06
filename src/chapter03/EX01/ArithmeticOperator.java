package chapter03.EX01;

public class ArithmeticOperator {

	public static void main(String[] args) {
		//연산자
		//1. 산술연산자(+, -, *, /, % (나머지값만 출력))
		System.out.println(2+3);
		System.out.println(8-5);
		System.out.println(7*2);	
		System.out.println(7/2);		//몫만 출력, int 값이기 때문에 정수값으로 출력
		System.out.println(7.0/2.0);	// 제대로 나눈 값을 출력함, double  값이기 때문에 실수값으로 소숫점까지 출력
		System.out.println(8%5);		//나머지 값만 출력
		System.out.println("=======================");
		
		//2. 증감 연산자 : case1
			//++ : 1씩 증가
			//-- : 1씩 감소
			//변수에 오는 위치에 따라 값이 달라진다.(앞, 뒤)
		int value1 = 3;
		value1++;
		System.out.println(value1);
		
		int value2 =3;
		++value2;
		System.out.println(value2);
		
		System.out.println("===================================");
		
		//2. 증감연산자 case 2(해당 부분은 반드시 이해)
		int value3 = 3 ; 			//value3에 3을 넣는 것
		int value4 = value3++ ; 	//value3의 값을 먼저 value4에 대입하고 후에 value3 값이 +1 증가된다
		
		System.out.println(value3);		//4 대입되고 난 후의 값이 4가 출력
		System.out.println(value4);		//3 먼저 대입된 값이 3이라서 3으로 출력
		System.out.println("==================================");
		
		int value5 = 3;
		int value6 = ++value5;		//먼저 value5에 1을 더해서 value6에 대입 
									//++ 뒤에 있으면 대입을 먼저하고 증가, 앞에 있으면 증가시키고 대입
		
		System.out.println(value5);	//4
		System.out.println(value6);	//4
		System.out.println("======================================");
		
		//2. 증감 연산자 case 3
		int value7 = 3;
		int value8 = 4;
		int value9 =2+value7-- + ++value8;	//value7은 --가 뒤에 있기때문에 3값이 연산에 대입이 되고, 그 후에 감소시킨다  
											//value8은 ++가 앞에 있기때문에 증가된 5값이 연산에 대입이 된다
											// 2 + 3 + 5
		
		System.out.println(value7); 	//int value9에서 발생한 --연산자로 인해서 감소된 2값이 출력
		System.out.println(value8);		//int value9에서 발생한 ++연산자로 인해서 증가된 5값이 출력
		System.out.println(value9);
		
		
		
		
	}

}
