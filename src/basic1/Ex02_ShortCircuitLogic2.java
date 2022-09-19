package basic1;

import java.util.Calendar;

public class Ex02_ShortCircuitLogic2 {

	public static void main(String[] args) {

		int a =3;
		
		if(a>3 & ++a>3) {					//false(3>3)/ 숏서킷 적용되지 않아서 뒤에도 계산 그래서 4>3 나옴 
			System.out.println("조건만족");
		}
		System.out.println("a=" +a);		//a = 4

		if(a>1 | ++a>3) {					//a>1 true / 숏서킷 적용되지 않아서 뒤에도 계산 그래서 5>3 나옴
			System.out.println("조건만족2");	//조건만족2
		}
		System.out.println("a=" +a);		// a = 5	
	
		System.out.println("==========================================");
		String id = "200411-4234567";
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
	
		char chul = id.charAt(8);
		System.out.println(chul);
		//chul 변수가 0이라면 '서울'
		//chul 변수가 1이라면 '인천/부산'
		//chul 변수가 2라면 '경기'
		//chul 변수가 9라면 '제주'
		String home  = null;
		switch(chul) {				//()에 문자, 정수, 문자열
		case '0': 	home = "서울"; 	break;
		case '1': 	home = "인천/부산"; break;
		case '2': 	home = "경기"; 	break;
		case '3': 	home = "충북"; 	break;
		case '4': 	home = "충남"; 	break;
		case '5': 	home = "전북"; 	break;
		case '6': 	home = "전남"; 	break;
		case '7': 	home = "경북"; 	break;
		case '8': 	home = "경남"; 	break;
		case '9': 	home = "제주"; 	break;
		default :
			System.out.println("출신을 알 수 없습니다.");	
		}System.out.println(home +" 출신");
		
		// String id = "200411-4234567";
		String old = id.substring(0, 2);	//old = "20"	//substring에서 2로 지정한 이유는 2전까지의 글자를 가져오는 것을 의미
		//문자열 → 정수변환
		int old1 = Integer.parseInt(old);	//age = 20
		int age=0;
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		if(sung =='1' || sung=='2') {
			 age = year-(1900+old1)+1;
		}else if(sung =='3' || sung=='4') {
			age = year-(2000+old1)+1;
		}
		System.out.println(age);
		
				
}
}
