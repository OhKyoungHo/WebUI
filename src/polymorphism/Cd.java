package polymorphism;

public class Cd extends Item{

	String singer;

	public Cd() {}
	public Cd(String num, String name, String singer) {
		super(num,name);
		//super.num = num;
		//super.name = name;
		this.singer = singer;
	}

	public void output(String num, String name, String singer) {
		System.out.println("=====Cd 정보 출력=====");
		System.out.println("번호 : " + num);
		System.out.println("제목 :" + name);
		System.out.println("가수 :" + singer);



	}
}
