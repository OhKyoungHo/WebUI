package polymorphism;

public class Dvd extends Item{
	String actor;
	String director;

	public Dvd() {
		this("000", "제목없음", "무명","감독");
	}

	public Dvd(String num, String name, String actor, String director) {
		super(num,name);
		//super.num = num;
		//super.name = name;
		this.actor = actor;
		this.director = director;
	}
	public void output(String num, String name, String actor, String director ) {
		System.out.println("=====Dvd 정보 출력=====");
		System.out.println("번호 : " + num);
		System.out.println("제목 :" + name);
		System.out.println("배우 :" + actor);
		System.out.println("감독 : " + director);
	}
}
