package basic5;

public class Book {

	private static int count;
	
	public Book() {
		count++;
		
	}
	public static int getCount() {
		return count;		
	}
}

/*
 *static
 * - 객체의 공유
 * - 객체 생성보다 먼저 실행하기 때문에 클래스명 접근 가능, 
 * 변수에서 static을 사용하는 또 한가지 이유로 공유 개념을 들 수 있다. 
 * static 으로 설정하면 같은 곳의 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 되는 것이다.
 * 
 */
