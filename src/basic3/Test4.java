package basic3;

class Test4{
public static void main( String [] args ) {   
     try{
         System.exit(0);						//System.exit(0) 정상종료 System.exit(0이외의 값) 	비정상종료
} finally {
         System.out.println("FINALLY");
     } 
}
}