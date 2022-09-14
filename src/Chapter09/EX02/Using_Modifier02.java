package Chapter09.EX02;

import Chapter09.EX01.A;

// A 클래스와 다른 패키지네 존재하는 클래스 : import를 사용

public class Using_Modifier02 {

	public static void main(String[] args) {

		// import 됨
		A a = new A();
		
		//필드 접근
		System.out.println(a.a); 		//public
//		System.out.println(a.b); 		//protected : 다른 패키지에서 접근할 경우 상속관계
//		System.out.println(a.c); 		//default	<접근불가>
//		System.out.println(a.d); 		//private	<접근불가>
		
		//메소그 접근
		a.print1();		//public
//		a.print2();		//protected <접근불가>, 상속이 적용안되어 있음
//		a.print3();		//default
//		a.print4();		//private
		
		
		D d = new D ();
		d.print();
		
	}

}
