package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec5_31 {
//31 page
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		int lastList = 0;
		int max = 0;
		for(int i = 0; i < 100; i ++) {
			int intRan = (int)(Math.random() * 100) + 1;
			intList.add(intRan);
		}//end 리스트에 랜덤값 넣기
		
		for(int i = 0; i < intList.size(); i ++) {
			int num = intList.get(i);
			if(num > max) {
				max = num;
				lastList = i;
			}// 가장 큰 수를 만들기 위해 모든 값들을 큰 값과 같다고 해버린 것.
		}//end for
		System.out.printf("%3d : %3d\n", lastList, max);
		System.out.printf("%3d : %3d\n", lastList, intList.get(lastList));
		//위 두 개는 같은 출력문이다.
		
		int index = intList.indexOf(max);
		System.out.println("가장 큰 수가 처음 나타는 위치 : " + index);
		
		
	}//end main
}// end class
