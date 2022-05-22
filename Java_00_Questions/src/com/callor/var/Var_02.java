package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {
		
		double douNum1;
		double douNum2;
		douNum1 = (int)(Math.random() * 1000) + 1;
		douNum2 = (int)(Math.random() * 1000) + 1;
		
		double douAdd = douNum1 + douNum2 ;
		double douChar = douNum1 - douNum2;
		double douKop = douNum1 * douNum2;
		double douNanugi = douNum1 / douNum2;
		
		System.out.println(douAdd);
		System.out.println(douChar);
		System.out.println(douKop);
		System.out.println(douNanugi);
		
		
	}//end main
}//end class
