package inherit;

public class MainTest {

	public static void main(String[] args) {
		/*
		//Mom u =  new Mom();
		//u.job();
		//u.gene();
		
		Daughter d = new Daughter();
		d.study();
		d.job();
		d.gene();
		*/
		//Daughter d = new Mom();
		
		//*부모변수에 자식객체 생성이 가능
		Mom m =  new Daughter();	
		m.gene();		// 자식
		m.job();		// 직업없음
		//m.study();	// 부모가 자식만의  메소드를 불러오는 것은 불가능 
		// 오버라이딩이 되어 있기 때문에 엄마의 메소드 값이 나올것으로 보이지만 딸의 메소드 값이 출력
		
		//* 형 변환 : (casting)
		//1) 기본형끼리
		//2) 참조형에서 상속관계있는 경우만 가능
		
		//String s = new String("~~");
		// StringBuffer sb =  (StringBuffer) s; → X
		
		//Mom m =  new Mom();
		//Daughter d =  (Daughter)d;
		/*
		Daughter d =  new Daughter();
		Mom n = (Mom)d;					//Up casting
		Daughter d2 = (Daughter)n;		//Down casting
		*/
	}

}
//메모리 개념으로 딸 클래스가 엄마 클래스 상속 받고 있다. d는 엄마 클래스와 딸 클래스를 가리키고 있다.(둘다 접근 가능), 
//이러한 경우로 인해서 엄마 생성자에 있는 "엄마 생성"이 출력
//또한 같은 이름을 가지고 있으면 딸의 메소드를 불러낸다. 