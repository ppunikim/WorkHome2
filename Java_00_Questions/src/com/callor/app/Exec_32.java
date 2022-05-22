package com.callor.app;

import com.callor.utils.Line;

public class Exec_32 {
//32 page
	public static void main(String[] args) {
		
		System.out.println("이번달 간식은 피자이다.");
		System.out.println();
		int num = (int)(Math.random() * 25) + 25;
		int pizza = 6;
		
		if( num % pizza == 0) {
			System.out.printf("%d명에게는 %d개의 피자가 필요하다", num, num/pizza);
		} else {
			System.out.printf("%d명에게는 %d개의 피자가 필요하다.", num, ((num/pizza) + 1));
		}
		System.out.println();
		System.out.println(Line.sLine(50));
		System.out.println("피자집에 주문하러 가자.");
		
	}//end main
}//end class
