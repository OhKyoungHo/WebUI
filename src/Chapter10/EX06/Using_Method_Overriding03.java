package Chapter10.EX06;

class Animal{
	// 자식클래스에서 2개의 메소드를 오버라이딩
	// Animal 타입으로 정의, 배열에 저장후, 오버라이딩된 메소드 출력(for, Enhanced for)
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}

class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("100km/h로 달립니다.");
	}
	void eat() {
		System.out.println("육식을 주로합니다.");
	}
}

class Eagle extends Animal{
	@Override
	void run() {
		System.out.println("90km/h로 납니다.");
	}
	void eat() {
		System.out.println("벌레를 주로 먹습니다.");
	}
}

class Fish extends Animal{
	@Override
	void run() {
		System.out.println("10km/h로 달립니다.");
	}
	void eat() {
		System.out.println("미생물을 주로 먹습니다.");
	}
}

class Dog extends Animal{
	@Override
	void run() {
		System.out.println("20km/h로 달립니다.");
	}
	void eat() {
		System.out.println("잡식합니다.");
	}
}
public class Using_Method_Overriding03 {

	public static void main(String[] args) {
		// 1. 객체생성(Animal 타입으로 생성)
		System.out.println("=====Animal 타입으로 정의=====");
		Animal aa1 = new Animal();
		Animal bb1 = new Tiger();
		Animal cc1 = new Eagle();
		Animal dd1 = new Fish();
		Animal ee1 = new Dog();
		
		//Animal의 메소드 호출
		aa1.eat();
		aa1.run();
		bb1.eat();
		bb1.run();
		cc1.eat();
		cc1.run();
		dd1.eat();
		dd1.run();
		ee1.eat();
		ee1.run();
		
		//배열에 객체를 저장 : Animal 객체를 배열에 저장
		Animal [] arr1 = new Animal[] {aa1, bb1, cc1, dd1, ee1};
		
		//for 문으로 출력
		System.out.println("=====for 문으로 출력=====");
		for(int i=0; i<arr1.length ; i++) {
			arr1[i].run();
			arr1[i].eat();
		}
		
		//Enhanced for문으로 출력
		System.out.println("=====Enhanced for문으로 출력=====");
		for(Animal k : arr1) {
			k.run();
			k.eat();
		}
	}

}
