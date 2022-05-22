package com.callor.controller;

public class Method_02 {
	
	static int intNum1 = (int)(Math.random() * 100) + 1;
	static int intNum2 = (int)(Math.random() * 100) + 1;
	
	private static int add() {
		
		int intSum = intNum1 + intNum2;
		return intSum;
	}
	private static int multi() {
		int intMulti = intNum1 * intNum2;
		return intMulti;
	}
	
	public static void main(String[] args) {
		
		System.out.printf("두 수는 %d 와 %d 입니다.\n", intNum1, intNum2);
		System.out.println("두 수의 덧셈은 : " + add());
		System.out.println("두 수의 곱셈은 : " + multi());
		
		
	}//end main
}//end class
