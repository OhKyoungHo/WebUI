package basic3;

class Test8{
	   static String str = "";
	static void method( int i ){
	     try{
	if ( i == 10 ) throw new Exception();	//i가 10일때 예외를 던진다.
	str += "A";
	     } catch( Exception ex ) {
	 str += "B";
	 return;								//return;을 넣은 이유는 예외 값을 출력하면서 D를 출력하지 않기위해서 표기
	     } finally {
	str += "C";
	     }
	str += "D";
	}
	public static void main( String [] args ) {   
	    method( 5 );
	    method( 10);
	System.out.println(str);
	}
	}