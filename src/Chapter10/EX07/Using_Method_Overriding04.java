package Chapter10.EX07;


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

	int count;		//호랑이 마리 수 
	//생성자 : 정수를 인풋 받아서 count 필드에 값을 할당.
	Tiger(int count){
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("100km/h로 달립니다.");
	}
	void eat() {
		System.out.println("육식을 주로합니다.");
	}
}

class Eagle extends Animal{
	int count;		//독수리 수
	Eagle(int count){
		this.count = count;}
	@Override
	void run() {
		System.out.println("90km/h로 납니다.");
	}
	void eat() {
		System.out.println("벌레를 주로 먹습니다.");
	}
}

class Fish extends Animal{
	int count;		//물고기 마리 수 
	Fish(int count){
		this.count = count;}
	@Override
	void run() {
		System.out.println("10km/h로 달립니다.");
	}
	void eat() {
		System.out.println("미생물을 주로 먹습니다.");
	}
}

class Dog extends Animal{
	int count;		//강아지 마리수
	Dog(int count){
		this.count = count;}
	@Override
	void run() {
		System.out.println("20km/h로 달립니다.");
	}
	void eat() {
		System.out.println("잡식합니다.");
	}
}
public class Using_Method_Overriding04 {

	public static void main(String[] args) {
		// 1. 객체생성(Animal 타입으로 생성)
				//생성자를 통해서 각각의 필드에 값을 할당
				System.out.println("=====Animal 타입으로 정의=====");
				Animal aa1 = new Animal();
				Animal bb1 = new Tiger(10);		//10
				Animal cc1 = new Eagle(5);		//5
				Animal dd1 = new Fish(50);		//50
				Animal ee1 = new Dog(70);			//70
				
			//메소드 호출
				
				
		// 2. 객체를 배열에 할당
				Animal [] arr = new Animal [] {aa1, bb1, cc1, dd1, ee1};
		//3. for문을 사용해서 출력 : eat(), run(), 동물의 총 마리수
				//for 문을 사용해서 객체 Animal 객체로 뽑아서
				//다운캐스팅해서 자식 필드의 count 읽어서 총 더한 값을 출력
			
				
				//동물의 총합을 구하는 변수 선언
				int sum =0;
				
				for(int i=0; i<arr.length ; i++) {
				
				//배열에 각 방에 저장된 객체를 Animal 객체에 저장
				Animal aa = arr[i];
				aa.eat();			//Animal에 있는 eat() 메소드 : 오버라이딩된 메소드 출력
				aa.run();			//Animal에 있는 run() 메소드 : 오버라이딩된 메소드 출력
				if(aa instanceof Tiger) {
					Tiger t1 = (Tiger) aa;	
					sum+=t1.count;		//sum = sum + t1.count
				}
				if(aa instanceof Eagle) {
					Eagle e1 = (Eagle)aa;	
					sum+=e1.count;
				}
				if(aa instanceof Fish) {
					Fish f1 = (Fish)aa;	
					sum+=f1.count;
					
				}
				if(aa instanceof Dog) {
					Dog d1 = (Dog)aa;	
					sum+= d1.count;
				
				}

			}System.out.println("총 동물의 수는 " + sum +"마리입니다.");
			
			
			
				
		//4. Enhanced for문을 사용해서 출력		
	}

}
