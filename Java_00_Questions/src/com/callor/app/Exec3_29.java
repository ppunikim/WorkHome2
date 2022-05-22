package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec3_29 {
//29 page
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i < 100; i ++) {
			int intRan = (int)(Math.random() * 100) + 1;
			intList.add(intRan);
			System.out.print(intList.get(i) + "\t");
		}// 리스트에 랜덤값 추가
		
		System.out.println();
		int count = 0;
		for(int i = 0; i < intList.size(); i ++) {
			if(intList.get(i) >= 55) {
				System.out.printf("우리가 보는 %d 번째 : %d", count + 1, intList.get(i));
				break;
			}
			count++;
		}//end for
	}//end main
}//end class
