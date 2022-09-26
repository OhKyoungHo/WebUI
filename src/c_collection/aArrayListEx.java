
package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		Object[] result = dataSet();
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for(int i=0; i<result.length ; i++) {
			System.out.println(result[i]);
		}
		
		
		
	}

	static Object[] dataSet()				// 리턴을 위해서 void 대신 Object[]을 넣어줘야 함
	{
		String	name = "김태희";
		Integer age = 31;   //int age = 31;
		double	height = 162.3;

		Object []obj =  new Object[2];
		obj[0] = name;
		obj[1] = age;
		obj[2] = height;
		
		return obj;			// 리턴은 한가지 값만 리턴 가능, 하나의 배열로 만들어서 리턴시킴
		
		
	}
}
