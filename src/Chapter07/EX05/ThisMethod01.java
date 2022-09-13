package Chapter07.EX05;


class Abc {
	// 생성자 : 인풋 매개변수가 없는 생성자
	Abc(){
		System.out.println(" 첫 번째 생성자 - 기본 생성자 ");
	}
	
	Abc(int a){
		this();			//	 기본 생성자 호출
		System.out.println(" 두 번째 생성자 호출");
	}
	Abc(int a, String b){
		this(30);
		System.out.println(" 세 번째 생성자 호출");
		
	}
	Abc(int a, String b, String c){
		this(40,"오늘");
		System.out.println(" 네 번째 생성자 호출");
		
	}
	
}

public class ThisMethod01 {

	public static void main(String[] args) {
		/*
		ThisMethod : 자신 클래스의 다른 생성자 호출
			반드시 생성자 내부에서 사용, 메소드 내부 사용 x
			반드시 생성자 첫번째 라인에 위치
	*/		
			
			Abc abc1 = new Abc();		// 기본 생성자 호출
			
			System.out.println("=====매개변수가 1개인 생성자 호출 =====");
			Abc abc2 = new Abc(50);
			
			System.out.println("=====매개변수가 2개인 생성자 호출 =====");
			Abc abc3 = new Abc(40,"오늘");
			
			System.out.println("=====매개변수가 3개인 생성자 호출 =====");
			Abc abc4 = new Abc(40,"오늘","내일");

	}

}
