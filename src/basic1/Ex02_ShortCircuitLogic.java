package basic1;

public class Ex02_ShortCircuitLogic {

	public static void main(String[] args) {

		int a =3;
		
		if(a>3 && ++a>3) {					//false → 숏서킷으로 ++a 적용x
			System.out.println("조건만족");
		}
		System.out.println("a=" +a);		//a = 3

		if(a>1 || ++a>3) {					//a>1 true 숏서킷으로 뒤에값 적용 x(만약 &&라면 둘다 계산 )
			System.out.println("조건만족2");	//조건만족2
		}
		System.out.println("a=" +a);		// a = 3	
	}

}
