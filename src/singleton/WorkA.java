package singleton;

public class WorkA {			//WorkA는 클래스는 객체는 생성된다

	DBConnect con;
	
	public WorkA() {
		//con =  new DBConnect();
		//con.getInstance();
		con = DBConnect.getInstance();			//여기서 객체를 만들라고 주문
	}
	
	public void use() {
		System.out.println("A 작업");
	}
}
