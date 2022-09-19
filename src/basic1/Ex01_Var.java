package basic1;

//import java.lang.*;				// java에서기본적으로 넣어주는 코드 입력하지 않아도 된다.
//import java.lang.String;			// java.lang이라는 패키지에서 String을 가져와 쓴다. 

/*
 * 자료형(data type)
 * 1. 기본형
  	boolean
  	char
  	int /long
  	double
 * 2. 참조형
  	클래스
 	배열
	 → new 예약어를 통해 객체를 생성
 * (*)String -> 별종이다...따로 생각하자
 */
public class Ex01_Var {// extends Object 기본적으로 넣어주는 코드 입력하지 않아도 됨
	//*멤버변수 - 기본적으로 자동초기화가 되어 있음
	String a = null;
	int b = 0;

	public static void main(String[] args) {
		
		// *지역변수
		
		// 문자열 변수 a 선언
		String a = null;			// 초기화시켜주는 습관 키우기
		// 정수 변수 b 선언
		int b = 0;
		// 변수 b에 200 대입
		b=200;
		// 변수 a에 "Hello"을 지정
		a="Hello";
		//*****   
		// a =  new String("Hello"); String 클래스에서 가져오는 것이기 때문에 원래는 이렇게 써야함. 단, 간단하게 하기위해 위의 걸로 쓰기로 함!
		
		//변수 a와 b 콘솔에 출력
		System.out.println(a);
		System.out.println(b);

	}

}
