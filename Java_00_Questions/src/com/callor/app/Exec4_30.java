package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec4_30 {
//30 page
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		for(int i = 0 ; i < 100; i ++) {
			int intRan = (int)(Math.random() * 100) + 1;
			intList.add(intRan);
		}//리스트에 랜덤값 추가
		
		// for() index 를 역순으로 진행
		int size = intList.size();
		for(int i = size - 1; i > -1 ; i --) {
			if(intList.get(i) >= 55) {
				System.out.printf("%3d 번째 : %3d\t", i, intList.get(i));
				break;
			}
		}
		
		
		
	}//end main
}//end class
