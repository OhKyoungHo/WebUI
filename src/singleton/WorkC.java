package singleton;

public class WorkC {		//WorkC는 클래스는 객체는 생성되지 않고 주소값만 나온다.

	DBConnect con;
	
	public WorkC() {
		//con =  new DBConnect();
		//con.getInstance();
		con = DBConnect.getInstance();
	}

	public void use() {
		System.out.println("C 작업");
	}
}
