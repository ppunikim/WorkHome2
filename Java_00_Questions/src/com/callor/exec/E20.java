package com.callor.exec;

import com.callor.utils.Line;

public class E20 {
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		for(int index = 0; index < intNums.length; index ++) {
			intNums[index] = (int)(Math.random() * 100) + 1;
		}
		
		int length = 40;
		System.out.println(Line.dLine(length));
		System.out.println("짝수 리스트");
		System.out.println(Line.sLine(length));
		for(int index = 0; index < intNums.length; index ++) {
			System.out.print(intNums[index] + ",\t");
			if((index + 1)  % 5 == 0) {
				System.out.println();
			}
		}
			
		
		
	}//end main
}//end class
