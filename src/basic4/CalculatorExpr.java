package basic4;

public class CalculatorExpr {

	private int num1 ;
	private int num2 ;
	private int addition ;
	private int subtraction ;
	private int multiplication ;
	private double division ;


	//Setter
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	//메소드
	public void calAddition() {
		addition = num1 + num2;
	}
	public void calSubtraction() {
		subtraction = num1 - num2;
	}
	public void calmultiplication() {
		multiplication = num1*num2;
	}
	public void caldivision() {
		division = num1/(double)num2;
	}
	public void output() {
		
		System.out.println("덧셈 :" + addition);
		System.out.println("뺄셈 :" + subtraction);
		System.out.println("곱셉 :" + multiplication);
		System.out.println("나눗셈 :" + division );
	}
}



