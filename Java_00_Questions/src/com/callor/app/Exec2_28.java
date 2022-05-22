package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec2_28 {
//28 page : 리스트에 랜덤값 추가하는 방법
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		for(int index = 0; index < 100; index ++) {
			int intRan = (int)(Math.random() * 100 ) + 1;
			intList.add(intRan);
		}//end List
		/* 
		 * 리스트는 배열의 개수를 적어줘야 한다.
		 * 그리고 랜덤값의 정수형을 따로 선언해 
		 * 추가(add)해 주어야 한다.
		 */
		for(int intLists : intList) {
			if(intLists >= 55) {
				System.out.print(intLists + "\t");
			}
		}
		
		
		
	}//end main
}//end class
