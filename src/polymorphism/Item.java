package polymorphism;

public class Item {
	protected String num ;
	protected String name;

	public Item(){}									//기본 생성자 만들기

	public Item(String num, String name) {		//해당과정 잊지말기
		this.num =num;
		this.name=name;
	}

	public void output() {
		System.out.println("=====Item 정보 출력=====");
		System.out.println("번호 : " + num);
		System.out.println("제목 :" + name);


	}

}

