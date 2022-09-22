package basic5;

public class MainTest {

	public static void main(String[] args) {

		Book b1 = new Book();
		System.out.println("총 갯수 :" + b1.getCount());
		
		Book b2 = new Book();
		System.out.println("총 갯수 :" + b2.getCount());

		Book b3 = new Book();
		System.out.println("총 갯수 :" + b3.getCount());
		
		//System.out.println("총 갯수 :" + Book.count);			//static은 클래스명으로 접근
	}

}
