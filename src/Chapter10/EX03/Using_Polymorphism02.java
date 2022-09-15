package Chapter10.EX03;

class Animal{		//최상위 부모 클래스
	
	String name ;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}
class Tiger extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int tiger;	//호랑이 마리수
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아먹습니다.");
	}
	
}
class Eagle extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int eagle;	//독수리 마리수
	void eagleFly() {
		System.out.println("독수리는 하늘을 날라다닙니다.");
	}
}

class Dog extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int dog;
	void dogCry() {
		System.out.println("개는 멍멍멍 짖습니다.");
	}
}
class Dog_sub extends Dog{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	//Dog 클래스의 모든 필드와 메소드를 상속 받는다.
	int dog_sub;
	void dogsubCry() {
		System.out.println("새끼강아지는 낑낑 거립니다. ");
	}
}


public class Using_Polymorphism02 {

	public static void main(String[] args) {
		// 1. Animal 객체를 Animal 타입으로 생성
			// a1은 Animal 타입만 가진다.
				//Animal 클래스의 필드와 메소드만 접근 가능
		Animal a1 = new Animal();
		a1.name = "동물";
		a1.age = 10;
		a1.color = "동물의 색깔";
		
		a1.eat();
		a1.sleep();
		
		// 2. Tiger 객체를 Tiger 타입으로 생성
			//t1은 Animal, Tiger를 내포하고 있고, Tiger 타입으로 지정
			//t1은 Animal, Tiger의 필드와 메소드 모두 접근
		Tiger t1 = new Tiger();
		t1.name = "호랑이";
		t1.age = 8;
		t1.color= "줄무늬색";
		
		t1.eat();
		t1.sleep();
		t1.tigerEat();
		
		//3. Tiger 객체를 Animal 타입으로 생성	//업캐스팅
			//a2은 Animal, Tiger를 내포하고 있고, Animal 타입으로 지정
			//a2는 Animal의 필드와 메소드만 접근
		Animal a2 = new Tiger();
		a2.name = "벵갈호랑이";
		a2.age = 11;
		a2.color = "줄무늬색";
		
		a2.eat();
		a2.sleep();
		
		//4. Dog 객체를 Dog 타입으로 생성
			//d1은 Animal, Dog 를 내포하고 있고, Dog 타입으로 지정
			//d1은 Animal, Dog 필드와 메소드 모두 사용가능
		Dog d1 = new Dog();
		d1.name = "강아지";
		d1.age = 4;
		d1.color = "흰색";
		d1.dog = 8;
		
		d1.eat();
		d1.sleep();
		d1.dogCry();
		
		//5. Dog 객체를 Animal 타입으로 생성
			//a3는 Animal, Dog를 내포하고 있다. Aniaml 타입으로 지정
			//a3는 Animal의 필드와 메소만 접근
		Animal a3 = new Dog();
		a3.name = "웰시코기";
		a3.age = 6;
		a3.color = "갈색";
		
		a3.eat();
		a3.sleep();
		
		//6. Dog_sub 객체를 Dog_sub 타입으로 생성
			//ds1는 Animal, Dog, Dog_sub 타입을 내포하고 있고, Dog_sub타입으로 지정
			//ds1는 Animal, Dog, Dog_sub의 모든 필드와 메소드 접근 가능
		Dog_sub ds1 = new Dog_sub();
		ds1.name = "도베르만";
		ds1.age = 15;
		ds1.color = "검정색";
		ds1.dog = 10;
		ds1.dog_sub = 7;
		
		ds1.eat();
		ds1.sleep();
		ds1.dogCry();
		ds1.dogsubCry();
		
		//7. Dog_sub 객체를 Dog 타입으로 지정
			//d2는 Animal, Dog, Dog_sub 타입을 내포하고 있고, Dog 타입으로 지정
			//d2는 Animal, Dog의 필드와 메소드만 접근
		Dog d2 = new Dog_sub();
		d2.name = "진돗개";
		d2.age = 6;
		d2.color = "흰색";
		d2.dog = 4;
		
		d2.eat();
		d2.sleep();
		d2.dogCry();
		
		//8. Dog_sub 객체를 Animal 타입으로 지정
			//a4는 Animal, Dog, Dog_sub를 내포하고 있고, Animal 타입으로 지정
			//a4는 Animal의 필드와 메소드만 접근 가능
		Animal a4 = new Dog_sub();
		a4.name ="삽살개";
		a4.age = 10;
		a4.color = "회색";
		
		a4.eat();
		a4.sleep();
		
		

	}

}
