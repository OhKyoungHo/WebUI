package chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D_02 {

	public static void main(String[] args) {
		//

		String[][] arr1 = new String[][] { { "홍길동", "이순신", "세종대왕" }, { "독수리", "부엉이", "닭", "오리" }, 
			{ "붕어", "가물치", "잉어" }, { "호랑이", "사자", } };

		/*
		 * 출력 : 사람이름 : 홍길동 이순신 세종대왕 새이름 : 독수리 부엉이 닭 오리 물고기이름 : 붕어 가물치 잉어 포유류이음 : 호랑이 사자
		 */
		System.out.println("=====직접 출력=====");		
		System.out.println("사람이름 : " + arr1[0][0] + " " + arr1[0][1] + " " + arr1[0][2] + " ");
		System.out.println("새이름 : " +arr1[1][0] + " " + arr1[1][1] + " " + arr1[1][2] + " " + arr1[1][3] + " ");
		System.out.println("물고기이름 : " +arr1[2][0] + " " + arr1[2][1] + " " + arr1[2][2] );
		System.out.println("포유류이름 : " +arr1[3][0] + " " + arr1[3][1] );
		System.out.println();
		
		System.out.println("=====for 문을 사용해서 출력=====");
		// 1. for 문으로 출력
		
		
		//선생님.ver
		 for(int i =0 ; i<arr1.length; i++){
			 if(i==0) {System.out.print("사람이름 : ");}
			 if(i==1) {System.out.print("새이름 : ");}
			 if(i==2) {System.out.print("물고기이름 : ");}
			 if(i==3) {System.out.print("포유류이름 : ");}
		 	for(int j =0; j <arr1[i].length ; j++){
		 	System.out.print(arr1[i][j] +" ");
		 	}
		 	System.out.println();
		 }
		 for(String []a : arr1) {
			 for(String b : a) {
				 if(b.equals("홍길동")) {System.out.print("사람이름 : ");}
				 if(b.equals("독수리")) {System.out.print("새이름 : ");}
				 if(b.equals("붕어")) {System.out.print("물고기이름 : ");}
				 if(b.equals("호랑이")) {System.out.print("포유류이름 : ");}
				 System.out.print(b + " ");
			 } System.out.println();
		 }
		 System.out.println("===================================");
		 
		 for(int i =0; i<arr1.length; i++) {
			 if(i==0) {System.out.print("사람이름 : ");}
			 if(i==1) {System.out.print("새이름 : ");}
			 if(i==2) {System.out.print("물고기이름 : ");}
			 if(i==3) {System.out.print("포유류이름 : ");}
		 System.out.println(Arrays.toString(arr1[i]));
	}
		  
		  /* 내 버전
		  for (int i = 0, j=0; i < arr1.length; i++, j++) {
			if(i==0) {
				System.out.print("사람이름 : " +  arr1[i][j] + " ");
			}else if(i==1) {
				System.out.print("새이름 : " +  arr1[i][j] + " ");
			}else if(i==2) {
				System.out.print("물고기이름 : " +  arr1[i][j] + " ");
			}else
			System.out.print("포유류이름 : " + arr1[i][j] + " ");
			System.out.println();
		}
		
		
		
		System.out.println("=====Enhanced for 문을 사용해서 출력=====");
		 //2. Enhanced for
		for(String [] a : arr1) {
			for(String k : a) {
				System.out.print( k + " ");
			}System.out.println();
		}
		System.out.println("=====Arrays.toString()을 사용해서 출력=====");
		// 3. Arrays.toString()
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		*/
	    /*  재동.ver
		String [] s = new String[]{"사람","새","물고기","포유류"};		// ★참조변수 a라는 방에 s를 넣음
	     
	      System.out.println("=====for문으로 출력=====");
	      // 1.  for문으로 출력
	      for(int i =0; i<arr1.length; i++) {
	         System.out.print(s[i] + "이름 : ");
	         for(int j=0; j<arr1[i].length; j++) {
	            System.out.print(arr1[i][j] + " ");
	         }
	         System.out.println();
	      }
	      System.out.println("=====Enhanced for문으로 출력=====");
	      // 2. Enhanced for 
	      int e =0;
	      for (String a[]: arr1){
	         
	         System.out.print(s[e] +"이름 : ");
	         for(String k :a) {
	            System.out.print(k+ " ");
	         }
	         System.out.println();
	         e++;
	      }
	      
	      System.out.println("====Arrays.toString() 문으로 출력=====");
	      // 3. Arrays.toString()
	      for(int i =0; i<arr1.length; i++) {
	         System.out.print(s[i] + "이름 : ");
	         System.out.println(Arrays.toString(arr1[i]));
	      }
	      */

		
	}

}
