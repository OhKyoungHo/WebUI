package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();		//순서를 저장하지 않음
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	
		
		System.out.println( set );		//[zebra, rabbit, elephant, fox] ,값이 중복해서 출력되지 않음
	}
}
