package polymorphism;

public class Book extends Item{
	String author;
	String publisher;
	public Book() {
		this("000", "제목없음", "무명","출판사");
		//System.out.println("Book 기본생성자");
	}				//기본생성자
	public Book(String num, String name, String author, String publisher) {
		//super.num = num;			// 자식 클래스가 부모 클래스로부터 상속받은 멤버를 참조할 때 사용하는 참조 변수
		//super.name = name;
		super(num,name); 	//super()는 부모 클래스의 생성자를 호출하는 메서드
							//this보다 앞에
		this.author = author;
		this.publisher = publisher;
		//System.out.println("Book의 인자 생성자");
		}

	public void output() {
		System.out.println("=====Book 정보 출력=====");
		System.out.println("번호 :" + num);
		System.out.println("제목 :"+ name);
		System.out.println("저자 :" + author);
		System.out.println("출판사 :" + publisher);
	}

}
