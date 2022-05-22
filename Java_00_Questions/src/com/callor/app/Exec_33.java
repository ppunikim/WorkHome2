package com.callor.app;

public class Exec_33 {
//33 page
	public static void main(String[] args) {
		
		/*
		 * 5만원일 때는 5로 나누고, 
		 * 1로 시작하는 것은 2로 나누면 된다.
		 */
		int pay = 523_240;
		int money = 50000;
		boolean sw = true;
		
		while(pay > 0) {
			int paper = pay / money;
			System.out.printf("%7d권 : %5d매\n", money, paper);
			pay -= paper*money;
			if(sw) {
				money = money / 5;
			} else {
				money = money / 2;
			}
			sw = !sw;
		}//end while
	}//end main
}//end class
