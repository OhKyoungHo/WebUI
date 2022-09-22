package basic4;
class Var {

  //private  int  i; private로 인해서 컴파일 오류 발생/ 또는 Setter Getter 세팅해야함
  int  i;
}
public class Test01_1 {

    int  i;
    public  static  void main( String [] args ) {

               Var  v = new Var();

               System.out.println("i="+ v.i );
}



    }

