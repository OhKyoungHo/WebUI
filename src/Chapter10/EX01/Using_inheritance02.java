package Chapter10.EX01;

class Fruit{			//과일 ← 부모클래스
	String name;		//과일이름
	String color;		//과일 색깔
	int large;			//과일 크기
	
	void eat () {
		System.out.println("모든 과일은 맛이 있습니다");
	}
	void print() {
		System.out.println("과일이름 : " + name + ", "+ "과일 색깔 : " + color + ", "+ "과일 크기 : " + large);
	}
	
}

class Apple extends Fruit {			//사과 ← 자식클래스
	//자식 클래스만 가지는 필드1, 메소드1
	int sugarContent ;		//과일 당도
	void weather() {
		System.out.println(name + "는 당도가 " + sugarContent + "이고 가을에 먹기 좋습니다.");
	}
}

class Orange extends Fruit{			//오렌지 ← 자식클래스
	int sugarContent ;		//과일 당도
	void weather() {
		System.out.println(name + "는 당도가 " + sugarContent + "이고 사계절에 먹기 좋습니다.");
	}
}

class Banana extends Fruit{			//바나나 ← 자식클래스
	int sugarContent ;		//과일 당도
	void weather() {
		System.out.println(name + "는 당도가 " + sugarContent + "이고 여름에 먹기 좋습니다.");
	}
}

public class Using_inheritance02 {

	public static void main(String[] args) {
		// 1. Fruit 객체 생성
		System.out.println("=====Fruit 객체 출력=====");
		Fruit f = new Fruit();
		f.name = "과일";
		f.color ="과일의 색깔";
		f.large = 10;
		
		f.eat();
		f.print();
		
		// 2. Apple 객체 생성
		System.out.println("=====Apple 객체 출력=====");
		Apple a = new Apple();
		a.name = "사과";
		a.color = "빨강색";
		a.large = 5;
		a.sugarContent = 7;
		
		a.eat();
		a.print();
		a.weather();
		
		// 3. Orange 객체 생성
		System.out.println("=====Orange 객체 출력=====");
		Orange o = new Orange();
		o.name = "오렌지";
		o.color = "주황색";
		o.large = 4;
		o.sugarContent = 8;
				
		o.eat();
		o.print();
		o.weather();

		
		// 4. Banana 객체 생성
		System.out.println("=====Banana 객체 출력=====");
		Banana b = new Banana();
		b.name = "바나나";
		b.color = "노랑색";
		b.large = 8;
		b.sugarContent = 6;
						
		b.eat();
		b.print();
		b.weather();
		
		System.out.println("===========================================");
	}

}
