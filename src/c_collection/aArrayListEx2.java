package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics (원하는 자료형) 지정  "클래스 <자료형> 참조변수 = new 클래스<자료형>(); "
		
		list.set(3, "rat");
		System.out.println(list); 			//fox 대신에 rat으로 출력
		
		list.remove(1);
		System.out.println(list);  			//zebra가 없어진 상태에서 출력
		
		Collections.sort(list);				//sort()는 Comparable에 의해 리턴되는 값을 비교하여 오름차순 또는 내림차순으로 배열을 정렬
		System.out.println(list);
		
		//System.out.println(list);			//배열처리되어서 [rabbit, zebra, squirrel, fox, lion, elephant]형태로 출력
		for(int i=0; i<list.size();i++) {
			String data = (String)list.get(i);		//get은 object형으로 받음, 대신 원하는 형태로 받고 싶으면 (String)list.get(i)이런 형태로 앞에 쓰면 됨
			System.out.println(data);
		}
		
		//향상된 for문			//주로 많이 씀, 예의주시할것
								// ※ 향상된 for문을 쓰기 위해서는 generics 지정을  반드시 해야 함.
		for(String data : list) {				//반복문 돌때 마다 하나씩 처리 
			System.out.println(data);
		}
		
		
	}
}
