
package c_collection;
import java.util.ArrayList;

class aArrayListEx1
{
	public static void main(String[] args) 
	{
		ArrayList result = dataSet();
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for(int i=0; i<result.size() ; i++) {				//배열이 아닌경우에는 length 대신 size를 쓴다.
			System.out.println(result.get(i));
		}
		
		
		
	}

	static ArrayList dataSet()				// 리턴을 위해서 void 대신 ArrayList를 넣어줘야 함
	{
		String	name = "김태희";
		Integer age = 31;   //int age = 31;
		double	height = 162.3;

		ArrayList list = new ArrayList();		// 필요한 공간에 따라 스스로 확장함
												//배열을 쓰면 방의 갯수를 정확히 알고 설정해야함
												//but, ArrayList를 쓰면 방의 갯수를 알지 않아도 스스로 맞춰서 설정함
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;			
		
		
	}
}
