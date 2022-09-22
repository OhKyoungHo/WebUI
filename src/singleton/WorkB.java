package singleton;

public class WorkB {				//WorkB는 클래스는 객체는 생성되지 않고 주소값만 나온다.

	DBConnect con;
	
	public WorkB() {
		//con =  new DBConnect();
		//con.getInstance();
		con = DBConnect.getInstance();		//기존에 생성된 값이 존재하기 때문에 값을 반환해서 주소값만 나온다
	}

	public void use() {
		System.out.println("B 작업");
	}
}
