package Chapter07.EX05;

//반드시 this keyword를 사용해야 하는 경우 
//-> 생성자, 메서드의 매개변수 이름, 필드 이름이 동일한 경우 필드 이름에 this 명시해야함.
class AA {
	int m;
	int n;
	
	void init(int m, int n){	// this 명시 x -> 지역 변수
		m = m ;
		n = n;
	}
}
class BB{
	int m;
	int n;
	
	void init(int m, int n) {	// this 명시 -> this.m = 필드, m : 지역변수
		this.m = m;
		this.n = n;
	}
}

public class Thiskeyword02 {

	public static void main(String[] args) {
		AA aa = new AA();
		aa.init(10,20);
		System.out.println(aa.m);
		System.out.println(aa.n);
		
		BB bb = new BB();
		bb.init(10,20);
		System.out.println(bb.m);
		System.out.println(bb.n);

	}

}
