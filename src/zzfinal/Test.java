package zzfinal;

class Parent{
	final String field = "부모님꺼";
	final public void jib() {
		System.out.println("부모님이 만드신거");
	}
}

class Child extends Parent{
	Child(){
		//field = "내꺼";					//final로 인해 값 변경 못함(오버라이딩을 못하게 함)
	}
	/*public void jib() {
		System.out.println("내가 탕진함");		//final로 인해 값 변경 못함
	}*/
}

public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();
		
		
		
	}

}
