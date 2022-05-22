package com.callor.arrays;

public class ArrayV5_14 {
// 14페이지
	public static void main(String[] args) {
		
		int[] intScore = new int[100];
		for(int i = 0 ; i < intScore.length; i ++) {
			intScore[i] = (int)(Math.random() *  100) + 1;
		}// intScore 100개 배열값에 랜덤값 넣기
		
		
		for(int i = 0; i < intScore.length; i ++) {
			System.out.print(intScore[i] + ",\t");
			if((i + 1) % 5 == 0) {
				System.out.println();
			}// 1번부터 나눌 때 5로 나눠지는 것을 한칸 띄어쓰기 하려면
			// intScore[i] 가 아니라 i + 1 해야 한다.
		}
		
		
	}//end main
}//end class
