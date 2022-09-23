package inherit;

public class Daughter extends Mom{

	public Daughter() {
		System.out.println("딸 생성");
	}
	
	
	public void study() {
		System.out.println("딸은 공부중");
	}

	public void job() {							//오버라이딩 적용, 부모클래스의 메소드를 이용해서 재정의(동일한 이름으로 해야함.) 
		System.out.println("직업없음");
	}
	public void gene() {						//오버라이딩 적용, 부모클래스의 메소드를 이용해서 재정의(동일한 이름으로 해야함.) 
		System.out.println("자식");
	}

}
