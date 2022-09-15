package Chapter08.EX02;

//import를 사용해서 외부 패키지 접근
	// 동일한 클래스는 import로 사용 불가능

import Chapter08.EX01.A;
// import Chapter08.EX01.com.A;	//오류 : 동일한 이름의 클래스는 중복해서 import 할 수 없다.
// import Chapter08.EX01.B;		//오류발생, 접근제어자가 default, 다른 패키지에서는 접근 불가능

public class Using_Package02 {

	public static void main(String[] args) {
		
		// A 클래스는 동일한 패키지 내에 존재하지 않는다.(import를 해서 사용)
		// 	- A 클래스는 접근제어자가 public, protected(상속) 지정되어 있어야 한다.
		
		System.out.println("=====A 클래스 (public)=====");
		A a = new A();
		
		System.out.println(a.m); 	// 다른 패키지에서 접근
		System.out.println(a.n);
		
		a.print();
		
		System.out.println("=====B 클래스(default)=====");
		// B 클래스는 다른 패키지에 존재하고, 접근 제어자가 default로 할당 되어 있다.
		// 	외부 패키지에서는 접근이 불가능
		// B b =  new B();
		
		System.out.println("=====com.A 클래스 객체 생성=====");
		// 동일한 클래스는 import가 불가능하므로 전체 이름을 사용해서 객체를 생성해야 한다.
		
		Chapter08.EX01.com.A aa = new Chapter08.EX01.com.A ();
		System.out.println(aa.aa);
		System.out.println(aa.bb);
		
		aa.print();
		
		
		
	}

}
