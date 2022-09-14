package Chapter09.EX04;

class Student{
	
	static int serialNum = 1000;		//모든 객체에서 공유하는 필드, 객체를 생성할때마다 1씩 증가
	int studentID;						//학생 공유ID
	String studentName;					//학생 이름
	int grade;						//학년 : 기본값으로 4학년
	String address ;				//주소 : 기본값으로 "서울"
	
	//기본생성자
	Student(String studentName){
		serialNum++;					//객체를 생성시 1씩 증가
		studentID = serialNum;
		this.studentName = studentName; 
		grade = 4;
		address = "서울";
	}
	
	/*Student(){
	 * serialNum++;					//객체를 생성시 1씩 증가
		studentID = serialNum;
		grade = 4;
		address = "서울";
	  }
	  Student(String studentName){
	  		this();		//기본생성자 호출 후 아래 내용 실행
	  		this.studentName =  studentName ;
	 */
	 void show(){
		 
		System.out.println("학생 고유 ID : " + studentID + "," + " 학생이름 : " + studentName + "," 
										+ " 학년 : " + grade + "학년," + " 주소 : " + address);
		System.out.println();
	}
}

public class Student_Test {

	public static void main(String[] args) {
		// 객체를 생성시 자동으로 학번이 1000번 부터 1씩 자동으로 학번이 저장되어야 한다.
		// studentID : 1000부터 학생 객체를 생성할때 마다 고유한 값으로 적용되어 있어야 한다.
		System.out.println("=====학생 1=====");
		Student lee = new Student("이지원");		//1001
		lee.show();
		System.out.println("=====학생 2=====");
		Student hong = new Student("홍지원");		//1002
		hong.show();
		System.out.println("=====학생 3=====");
		Student jeong = new Student("정지원");	//1003
		jeong.show();
		System.out.println("=====학생 4=====");
		Student park =  new Student("박지원");	//1004
		park.show();
	}

}
