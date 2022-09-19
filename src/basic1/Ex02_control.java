package basic1;

/*
 제어문 : 프로그램 흐름을 변경하기 위해
	1) if
	2) switch
	3) for
	4) while / do~while
	
	5) break / continue
 */
public class Ex02_control {

	public static void main(String[] args) {
		
		String id = "123456-5234567";
		char sung = id.charAt(7);		//해당 변수에서 7번째 한글자를 뽑아냄
		System.out.println(sung);
		// sung 변수에 문자가 1이거나 3이거나 9이라면 남자출력				// 포인트는 '이거나'
		// 그렇지 않고 문자가 2이거나 4이거나 0이라면 여자를 출력
		
		if(sung == '1' || sung =='3' || sung =='9') {				// 숫자 1과 문자 1을 헷갈리면 안된다. 위에서 sung은 문자이다!!
																	// |(바이트연산자)를 하나만 써도 동일하게 본다 //if(sung == '1' | sung =='3' | sung =='9')
			System.out.println("남자");
		}else if(sung == '2' || sung =='4' || sung =='0') {
			System.out.println("여자");
		}else {
			System.out.println("성별을 알 수 없습니다.");
		}
	}

}
