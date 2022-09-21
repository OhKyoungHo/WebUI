package basic3;

class Test2{
static void method() {		//static void method()throw new Exception() 형태로 있어야 한다. 
  //throw new Exception();
}
public static void main( String [] args ) {   
     try{
         method();
} catch( Exception ex ) {
         System.out.println("예외처리");
     } 
}
}