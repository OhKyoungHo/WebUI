package singleton;
/******싱글톤 패턴******/
public class DBConnect {

	private DBConnect(){
		System.out.println("실제 디비 연결");

	}
	
	private static DBConnect con = null;		//객체 생성없이 하고 싶어서 싱글톤 패턴 사용
	
	public static DBConnect getInstance() {		//
		if(con ==null) {
			con = new DBConnect();
		}
		return con;								//A객체 생성 후에는 값이 있어서 뒤의 B,C는 객체 생성 못하고 주소값만 출력	
												//반환하는 메소드를 정의한 메소드에 각각에 참조변수에 갖고 있는 주소값 전달
	}
}
