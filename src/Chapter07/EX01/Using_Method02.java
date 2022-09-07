package Chapter07.EX01;

class Food{
	int a ;
	String food ;
	
	Food(int a , String food){
		this.a = a;
		this.food = food;
	}
	
	void call(){
		double p = a*a*3.14;
		System.out.println(food + " 넓이는 " + p + " 입니다.");
	}
}

public class Using_Method02 {

	public static void main(String[] args) {
		// 원의 반지름을 넣었을때 전체 넓이를 구하는 객체를 생성후 출력해 보세요
		// 피자 : 10(반지름)
		// 도넛 : 5(반지름)
		// 피자의 넓이는 00 입니다. 
		// 도넛의 넓이는 00 입니다.

		Food pizza = new Food(10, "피자");
		pizza.call();
		
		Food donut = new Food(5, "도넛");
		donut.call();
		
	}

}
