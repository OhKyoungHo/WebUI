package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> result  = method();
		// 학생정보를 여기서 출력하시오
		for(Student s : result) {			//★향상된 for문을 우선적으로!!
			System.out.println(s);
		}
		System.out.println("==================================");
		//[참고] 전체요소를 순서대로 검색
		// Enumeration → Iterator
		Iterator<Student> it = result.iterator();
		while(it.hasNext()) {				// 이런 것도 있구나...
			System.out.println(it.next());
		}
		
		
	}
	static ArrayList<Student> method() {							// return을 받기 위해서 ArrayList<Student>로 받음
		ArrayList<Student> list  = new ArrayList<Student>();		// generics를 클래스인 Student로 받음
		
		list.add(new Student ("홍길자",25));							// 여러가지 값을 받기 편하게 설정
		list.add(new Student ("홍길이",33));							// 새로운 객체 만드는 식 필요없이 
		list.add(new Student ("홍삼이",44));
		return list;
		
	}
}

//----------------------------------------------------------
class Student extends Object{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
