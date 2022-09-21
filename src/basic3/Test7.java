package basic3;

import java.io.IOException;

	class Test7{
	static void method() throws IOException {
	  throw new IOException();
	}
	public static void main( String [] args ) {   
	     try{
	         method();
	         System.out.println("TRY");
	     } //catch( Exception ex ) {
	         //System.out.println("EXCEPTION");		//Exception이 다 잡아먹어서 IOException를 잡아내지 못해서 컴파일 오류
	     											//Exception이 IOException보다 넓은 범위, 그래서위에서 Exception이 모든 예외 잡아냄 그래서 굳이 Exception이 다 잡아먹어서 IOExceptionException이 다 잡아먹어서 
	     											// 굳이 IOException를 잡는 글을 썼는지 컴파일 오류
	     
	     //} 
	     catch( IOException ex ) {
	         System.out.println("IOEXCEPTION");
	     } finally {
	System.out.println("FINALLY");
	     }
	 System.out.println("END");
	}
	}