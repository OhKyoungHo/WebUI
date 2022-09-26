package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet();
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snake");
		set.add("zebra");
		set.add("bee");

		System.out.println( set );		// [ant, bee, cat, dog, elephant, lion, snake, tiger, zebra]
										// 자동으로 정렬된 것처럼 출력 why? 메모리 구조 저장 특성으로 인해 정렬된것으로 나타남
		System.out.println(set.subSet("d", "s"));		// d부터 s 앞까지 출력
		System.out.println(set.headSet("e"));			// 가장 작은 원소부터 특정 값까지는 범위 접근
		System.out.println(set.tailSet("e"));			// 특정 원소부터 가장 큰 원소까지의 범위 접근
	}
}
