package basic1;

public class Ex03_for응용 {

	public static void main(String[] args) {

		for(int i=0 ; i<26 ;i++) {
			for(char a= 'A' ; a<='Z'; a++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		//1번
		System.out.println("=====1번=====");
		for(int i=0 ; i<26 ;i++) {
		for(char a= 'A' ; a<='A'+i; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		}
		//2번
		System.out.println("=====2번=====");
		for(int i=0 ; i<26 ;i++) {
			for(char a= 'A' ; a<='Z'-i; a++) {
				System.out.print(a + " ");
			}System.out.println();
		}
		//3번
		System.out.println("=====3번=====");
		for(int i=0 ; i<26 ;i++) {
		for(char a= (char)('A'+i) ; a<='Z'; a++) {
			
			System.out.print(a + " ");
		}System.out.println();
		}
		//4번
		System.out.println("=====4번=====");
		for(int i=0 ; i<26 ;i++) {
		for(char a = 'Z'; a>='Z'-i ; a--) {
			System.out.print(a +" ");
		}System.out.println();
		}
		//5번
		System.out.println("=====5번=====");
		for(int i=0 ; i<26 ;i++) {
			for(int a= 0 ; a<i; a++) {
				System.out.print("  ");}
			for(char a= (char)('A'+i) ; a<='Z'; a++) {
				System.out.print(a+" " );
			}System.out.println();
		}
			
	
		
			
	
	
	}

}
