package Chapter07.EX05;
import java.util.Scanner;
class Car{
	
	// this 키워드 	: 필드나 메소드 선언시 사용 불가.
	// 				- 생성자, 메소드 내부에서 필드나 메소드를 사용할때 자신의 필드나 메소드를 지칭
	//				- 자신의 객체의 필드나 메소드를 가르킨다. 기본저그올 생략해서 많이 사용. 
	//				- 반드시 사용해야 할 경우 : 메소드, 생성자에서 입력 매개변수 이름, 필드 이름이 동일할 경우
	// this ()		: 생성자 내부에서만 사용, 반드시 첫 라인에 위치
	//				- 자신의 객체의 다른 생성자를 호출
	//				- 생성자를 오버라이딩할때 코드를 간략하게 사용 
	
	String companyName;				// 현대 자동차
	String color;					// 검은색
	double maxSpeed;				// 200.0 km/h
	
	// 생성자
	Car(){	// 리턴타입이 없고, 클래스 이름과 동일
		this.companyName ="알수없음";		//this 키를 생략시 자동으로 컴파일러가 할당
		this.color = "알수없음";
		this.maxSpeed = 0;
	}
	Car(String companyName){				//매개변수 이름, 필드이름이 같을때 this 키워드사용
		this();								// this() 메소드, 기본 생성자 호출
		this.companyName = companyName;
	}
	Car(String companyName, String color){
		this(companyName);
		this.color = color;
	}
	Car(String companyName, String color, double maxSpeed){
		this(companyName,color);
		this.maxSpeed = maxSpeed;
	}
	
	//필드의 모든 값을 출력 메소드(print())
	void print() {
		System.out.println("회사의 이름은 " + companyName + "입니다.");
		System.out.println("차의 색깔은 " + color + "입니다.");
		System.out.println("차의 최고 속력은 " + maxSpeed + "km/h입니다.");
	}
	
}


public class ThisMethod04 {

	public static void main(String[] args) {
		System.out.println("===== 매개변수 0개 일때 ======");
		Car car1 = new Car();
		car1.print();
		
		System.out.println("===== 매개변수 1개 일때 ======");
		Car car2 = new Car("현대자동차");
		car2.print();
		
		System.out.println("===== 매개변수 2개 일때 ======");
		Car car3 = new Car("현대자동차","검정색");
		car3.print();
		
		System.out.println("=====매개변수 3개 일때 ======");
		Car car4 = new Car("현대자동차","검정색",200.0);
		car4.print();

	}

}
