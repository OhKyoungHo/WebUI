package basic3;

public class Ex03_CallByString {	//String 클래스는 조금의 변화라도 있으면 새로운 영역을 잡는다. 콜바이 밸류와 레퍼런스와는 다른 유형이기 때문에 헷갈리지 않도록

	public static void main(String[] args) {


		String a= new String("안녕");
		String b= new String("하이");
		
		add(a,b);
		System.out.println("A= " +a + ", B=" + b);			// a = 안녕, b=하이
		
	}

	static void add(String a, String b) {
		a+=b;
		System.out.println("A= " +a + ", B=" + b);			// a = 안녕하이, b=하이
	}
	
}
