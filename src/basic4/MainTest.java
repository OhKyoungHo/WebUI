package basic4;



public class MainTest {

	public static void main(String[] args) {
		
		
		//값지정 1 - Setter
		Student s =new Student();			//Student 클래스 안에 멤버에 접근하려면 s 변수명에 점(.) 을 붙여서 멤버를 지정하여 사용 가능
											//new를 이용하여 메모리에 객체를 생성
		s.setName("홍길동");					//setName을 이용하면 이름에 문제가 생겼을때 set부분가서 확인만 하면된다.
		s.setKor(100);
		s.setEng(60);
		s.setMath(75);
		
		/*
		//값지정 2 -  생성자
		Student s = new Student("홍길자", 99, 88, 77);
		*/
		
		s.calTotal();
		s.calAvg();		
		//s.total =0;
		s.output();			
		
		
		
	}

}
