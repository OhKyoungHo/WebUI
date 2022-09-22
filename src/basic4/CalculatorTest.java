package basic4;
import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {
		// 객체 생성
		Scanner input = new Scanner(System.in);
		CalculatorExpr h= new CalculatorExpr(); 

		System.out.println("두개의 정수를 입력하세요.");
		h.setNum1(input.nextInt());
		h.setNum2(input.nextInt());

		h.calAddition();
		h.calSubtraction();
		h.calmultiplication();
		h.caldivision();
		h.output();

		while(true) {
			System.out.println("계속하시겠습니까?(Y/N), 끝낼려면 N 입력");
			if(input.next().toLowerCase().equals("n")) {
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println("두개의 정수를 입력하세요.");
			int num1 =input.nextInt();
			int num2 =input.nextInt();
			h.setNum1(num1);
			h.setNum2(num2);

			h.calAddition();
			h.calSubtraction();
			h.calmultiplication();
			h.caldivision();
			System.out.println("추출된 숫자는 " + num1 + "," +num2 +"입니다.");
			h.output();
		}
		input.close();
	}
}
