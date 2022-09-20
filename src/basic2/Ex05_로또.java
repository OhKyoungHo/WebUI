package basic2;

public class Ex05_로또 {

	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		//값지정
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
		}
		
		// 정렬
		for(int i=lotto.length-1 ; i>0 ;i--) {			// length에 -1하는 이유는 끝까지 가는데 방갯수-1번을 한다
			for(int j=0 ;j<i ;j++ ) {					// j<i 인 이유는 위에서 맨 끝 방에 값을 확정 시켰기 때문에 하나 줄어든 방의 갯수로 문장을 만들어야 한다
				if(lotto[j]>lotto[j+1]) {				//ex) lotto[0]의 값이 lotto[1]보다 클때 lotto[1]이 lotto[0]이 되고 lotto[0]의 값이 lotto[1]이 된다.
					int temp =lotto[j];					// 이러한 경우에 lotto[0]값이 lotto[1] 값으로 덮어지기 때문에 덮어진 전 값을 지키기 위해서 변수 temp를 사용 
					lotto[j] = lotto[j+1];				// 위의 for(i)문 1번 돌때 밑에 for(j)문 5,4,3,2,1 순으로 돔
					lotto[j+1] =temp;
				}
			}
		}
		
		
		//번호 출력 
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "/");
		}
	/*
	 * int a =5, b=10;
	 * int temp;
	 * temp=a;
	 * a=b;
	 * b=temp;
	 */
		
		
		
		
	/*
	 * Math.random() : 0.0 ← 소수점수 <1.0
	 * ex)0.1234
	 * 	  0.00123
	 * 	  0.5673
	 *    0.9999
	 * Math.random()*10    
	 *  ex)0.1234 → 1.234 
	 * 	  0.00123 → 0.0123
	 * 	  0.5673 → 5.673
	 *    0.9999 → 9.999   
	 *    
	 *    
	 * (int)Math.random()*10    
	 *  ex)0.1234 → 1.234 → 1
	 * 	  0.00123 → 0.0123 → 0
	 * 	  0.5673 → 5.673 → 5
	 *    0.9999 → 9.999 → 9			
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
