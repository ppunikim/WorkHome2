package com.callor.controller;

public class Method_01 {
	
	private static int num(){
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		return intNum1 + intNum2;
	}
	
	public static void main(String[] args) {
		
		System.out.println(num());
		
		
	}//end main
}//end class
