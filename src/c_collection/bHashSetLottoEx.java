package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet <Integer>lottos = new HashSet<Integer>();   //

		//for(int i=0; i<6; i++) {   for문으로 하면 5개 값만 나오는 경우 발생
		while(lottos.size()<6) {	//while문으로 하면 6개 값을 가진 경우만 출력 가능	
			int num =  (int)(Math.random()*45)+1;
			lottos.add(num);
		}
		System.out.println(lottos);
		
		ArrayList list = new ArrayList(lottos);			
		Collections.sort(list);					//list를 쓰고 싶으면 list 인터페이스 중 ArrayList 이용해서 해야함, ArrayList는 동적 배열 제공
		System.out.println(list);
	}
}
