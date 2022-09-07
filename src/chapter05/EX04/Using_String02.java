package chapter05.EX04;

public class Using_String02 {

	public static void main(String[] args) {
		//String 변수의 값을 할당하는 방법
		//	1. 객체 생성 방법으로 값을 할당(생성자)	//별도의 주소 공간에 값을 할당(동일한 문자열)
		//	2. 리터럴 방식으로 값을 할당			// 주소공간을 공유(동일한 문자열일 경우)
		//	== : 스택 공간의 값을 비교 ( 참조 자료형 : Stack(주소), Heap(값))
		//							( 기본 자료형 : Stack(값)
		//	equals() : 참조 자료형일때 Heap영역의 값을 비교
		
		//
		String str1 = new String("안녕");	//
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String ("안녕");	//
		
		System.out.println(str1);			//객체의 주소가 나오는 것이 아닌 값이 출력
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("======================================================");
		
		// == : 참조자료형일 경우 Stack의 Heap 영역 주소 비교
		System.out.println(str1 == str4); // false, new를 통해서 만들어졌기 때문에 각자 다른 주소값을 가지고 있음
		System.out.println(str2 == str3); // true, 리터럴 방식으로 값을 할당했기 때문에 동일한 주소값을 가지고 있음
		
		// equals() : 참조자료형의  Heap 영역 값을 비교
		System.out.println(str1.equals(str2)); 	//true
		System.out.println(str2.equals(str4));	//true
		System.out.println(str3.equals(str4));	//true
		
		
		
		
		
		
	}

}
