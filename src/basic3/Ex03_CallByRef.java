package basic3;

public class Ex03_CallByRef {				//CallByRef : 데이터가 있는 주소(메모리)를 참조한다(값을 복사하는 게 아님). 객체나 배열에서 call by reference가 발생하다.
														// 주소값에 의한 전달

	public static void main(String[] args) {


		StringBuffer a= new StringBuffer("안녕");
		StringBuffer b= new StringBuffer("하이");
		
		add(a,b);
		System.out.println("A= " +a + ", B=" + b);			// a = 안녕하이, b=하이
		
	}

	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);
		System.out.println("A= " +a + ", B=" + b);			// a = 안녕하이, b=하이
	}
	
}


/*
 문자열 처리 클래스
 - String
 - StringBuffer :  문자열을 추가하거나 변경 할 때 주로 사용하는 자료형/ StringBuilder
 
*/
