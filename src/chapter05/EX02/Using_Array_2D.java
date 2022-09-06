package chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D {

	public static void main(String[] args) {
		// 2차원 배열을 출력

		int[][] arr1 = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7 }, { 8, 9, 10 }, { 11, 12 } };

		System.out.println("=====직접출력=====");
		System.out.println(arr1[0][0] + " " + arr1[0][1] + " " + arr1[0][2] + " " + arr1[0][3] + " " + arr1[0][4]);
		System.out.println(arr1[1][0] + " " + arr1[1][1]);
		System.out.println(arr1[2][0] + " " + arr1[2][1] + " " + arr1[2][2]);
		System.out.print(arr1[3][0] + " " + arr1[3][1]);
		System.out.println("===================");
		System.out.println(arr1.length);		//4 ← 행의 갯수
		System.out.println(arr1[0].length);		//5 ← 0행의 열의 갯수
		System.out.println(arr1[1].length);		//2 ← 1행의 열의 갯수
		System.out.println(arr1[2].length);		//3 ← 2행의 열의 갯수
		System.out.println(arr1[3].length);		//2 ← 3행의 열의 갯수
		
		System.out.println("=====for 문을 사용해서 출력=====");
		for (int i = 0; i < arr1.length; i++) {				// i : 행의 index 번호
			for (int j = 0; j < arr1[i].length; j++) {		// j : 열의 index 번호
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=====Enhanced for 문을 사용해서 출력=====");
		for (int[] a : arr1) {
			for (int k : a) {
				System.out.print(k + " ");
			}
			System.out.println(); // 각 행마다 enter 기능 해줄 수 있게 안의 for문 안에 넣어줌
		}

		//4. Arrays.toString() ← 1차원 배열의 값을 출력
		System.out.println("=====Arrays.toString(arr[0])을 사용해서 출력=====");
		for(int i =0 ; i<arr1.length ; i++) {			//4번 루프 
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		
		
	}

}
