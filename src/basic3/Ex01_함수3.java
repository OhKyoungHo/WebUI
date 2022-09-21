package basic3;

public class Ex01_함수3 {

	public static void main(String[] args) {

		int [] result = add();
		int  sum =result[0] + result[1]; 
		System.out.println("합 : " + sum);
		
		//a와 b의 값을 받아서 합한 결과를 여기서 출력
		
	}

	static int[] add() {  //보내는 자료형은 int[] 이다
		int a =10, b=20;
		int [] arr = {a,b};
		return arr;				//return 할때 두개의 값을 동시에 보낼 수가 없다. 이러한 경우에는 위의 int 값을 배열해서 보내면 된다.
	}
	
}
