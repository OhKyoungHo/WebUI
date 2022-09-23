package homework;

public class Book {
	String title ;
	String author;
	String publisher;
	
	public Book() {}
	
	public Book(String title, String author, String publisher ) {
		this.title =title;
		this.author = author;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public void output(String title, String author, String publisher) {
		System.out.println("책의 제목 :" + title);
		System.out.println("저자의 이름 :" + author);
		System.out.println("책의 출판사 :" + publisher);
		
	}
}
