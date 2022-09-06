package chapter02.EX05;

public class DataType02 {

	public static void main(String[] args) {
		//float와 double의 정밀도
			//float : 소숫점 7자리까지 정밀도가 유지됨
			//double : 소숫점 15자리까지 정밀도가 유지됨
		float f1 = 1.0000001F;		//float 변수에 값을 저장할때 casting 필요
									//		변수값앞 (float),  변수값뒤 F
									//float값을 넣을때는 점을 찍을 경우 double로 인식해서 오류 발생 -> float를 써주거나 뒤에 F를 써준다.
									//리터럴 : 변수에 저장되는 값을 호칭할때
		System.out.println(f1);
		
		float f2 = 1.00000001F;	
		System.out.println(f2);	//해당 정밀도가 유지되지 않는 이유는 float는 소숫점 7자리까지만 정밀도가 유지되기 때문
		
		System.out.println("===========");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2); 	//해당 정밀도가 유지되지 않는 이유는 double는 소숫점 15자리까지만 정밀도가 유지되기 때문
	}

}
