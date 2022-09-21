package basic3;

public class Ex03_CallByValue {					//CallByValue는 위에서 복사한 값이 밑에서 식을 마치고 다시 위로 올라올때 위의 값에 영향을 끼치지 않는다. 
												//밑의 값을 함수의 인자로 파라미터로 넘길때 값을 복사해서 넘기기 때문에 원본의 값은 변하지 않는다.
												//값에 의한 전달

	public static void main(String[] args) {
		
		int a=10, b=20;
		add(a,b);
		System.out.println("A=" + a + ", B= " + b);		//두번째, a=10, b=20

	}

	static void add(int a, int b) {							//새로운 add 영역과 위에서 복사한 a,b 생성
		a +=b;
		System.out.println("A=" + a + ", B= " + b);		//첫번째, a=30, b=20
	}													// 위로 올리면서 나왔던 a=30, b=20의 값은 없어진다.
	
	
}
