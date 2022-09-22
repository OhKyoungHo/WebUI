package basic4;

public class Student {		//나올 값들을 하나로 묶는 것이 클래스...서로 다른 데이타 타입의 값들을 하나로 묶은 것

	private String hakbun;
	private String name;
	private int kor, eng , math;
	private int total;
	private double avg;

	public Student() {	// 기본생성자 생성, 만약 다른 생성자를 만들었을시 기본생성자는 자동으로 생성되지 않는다.
		//this.name = "이름없음";
		//this.kor =50;
		//this.eng = 50;
		//this.math = 50;
		this("이름 없음", 50,50,50);	  //이걸로 인해서 생성자 함수로 이동
		System.out.println("기본생성자");	// 생성자 함수 과정이 끝나면 다시 위로 복귀
	} 
	
	//생성자 함수
	public Student(String name, int kor, int eng, int math) {			
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자있는 생성자"); // 출력
	}

	//Setter
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {		// main test에서 들어온 name이 String name으로 들어감 
		// this를 사용하면, 메서드의 인수나 변수에 필드와 같은 이름을 붙여도 그것들을 구분하여 사용할 수 있습니다.
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	//메소드

	public void calTotal() {
		total = kor + eng+ math;

	}
	public void calAvg() {
		avg = total / 3;
	}
	public void output() {
		System.out.println(name +"님 성적 : " + total +"/" +avg);
	}

	//클래스는 자료들과 자료들을 동작시킬 수 있는 메소드를 묶어 놓은 곳이다!

}
/*
 * 캡슐화
 * 	-멤버변수(field) : private 
 *  -멤버메소드: public
 */
