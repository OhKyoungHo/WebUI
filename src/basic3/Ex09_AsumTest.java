package basic3;

public class Ex09_AsumTest {

	public static void main(String[] args) {
		int sum =sumFunc(3);
		System.out.println("합 :" + sum);

	}

	static int sumFunc(int i) {					//sumFunc(3)이 내려가면 위의 과정을 마무리 지을때까지 순환
		// sum = 1 + 2 + 3
		if(i ==1) return 1;
		
		return i + sumFunc(i-1);
		
		
	}
	
}
