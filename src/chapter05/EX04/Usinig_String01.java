package chapter05.EX04;

public class Usinig_String01 {

	public static void main(String[] args) {
		// String : 참조 데이터 타입, 문자열을 처리, 아주 특별한 기능들이 많이 들어가 있다.
		
		//1. 객체 생성을 사용해서 값을 할당. (객체의 주소는 별개로 작동)
		String str1 = new String("안녕");
					//new Heap 메모리에 값을 할당
					//String() : 생성자의 매개변수에 "안녕" 문자열을 할당.
		
		System.out.println(str1);
		
		String str11 = new String("안녕");
		
		System.out.println(str1 == str11); 	//str1과 str2의 객체의 주소를 비교
				//false ← 두 객체의 번지수가 다르다.(new를 통해서 각자 다른 번지에 "안녕"을 넣어서 다르다.)
		System.out.println(str1.equals(str11));	//str1과 str2의 객체의 값을 비교.
				//true ← 객체에 저장된 값을 비교.
		
		System.out.println("================================================================");
		
		//2. 리터럴로 값을 할당(객체의 주소(번지)를 공유)
			//리터럴 : 변수에 들어가는 값을 통칭해서 리터럴
		String str2= "안녕하세요";
		System.out.println(str2);
		
		String str22 = "안녕하세요" ;
		System.out.println(str2 == str22); 		//str2와 str22는 동일한 번지를 가리킨다.
		System.out.println(str2.equals(str22));	//객체의 값을 비교. str2와 str22는 같은 값을 가진다. 
		
		/*String str3 ;
		str3 =str2 ;		//객체의 번지를 복사
		*/
		
		
		
	}

}
