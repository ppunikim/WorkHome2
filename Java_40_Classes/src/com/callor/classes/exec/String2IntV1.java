package com.callor.classes.exec;

import com.callor.utils.Line;

public class String2IntV1 {
	public static void main(String[] args) {
		
/* 기억해야 할 것
 * 1. 문자열을 정수형 문자로 : Integer.valueOf
 * 2. 정수형 숫자를 문자열형으로 : Integer.String
 * 								 : 정수형 변수 + "" 
 */
		String strAge = "";
		int intAge = 33;
		
		// 숫자형 변수 + 문자열("") : 숫자값을 문자열형 값으로 형변환
		strAge = intAge + "";
		
		/* Integer.toString(정수값) : 
		 * Integer 클래스에 선언된 toString static method에게
		 * 정수값 arg로 전달하여 문자열로 return 받는다.
		 * 
		 * Integer.toString() 메서드를 사용하여
		 * 정수형 숫자를 문자열로 바꾼다.
		 */
		strAge = Integer.toString(intAge);
		System.out.print("문자열 숫자 : ");
		System.out.println(strAge);
		
		/* Integer.valueOf() 메서드를 사용하여
		   문자열형 숫자를 정수형 숫자로 바꾼다
		 */
		strAge = "55";
		intAge = Integer.valueOf(strAge);
		System.out.printf("%d는 정수형 숫자이다.\n", intAge);
		System.out.println(Integer.toBinaryString(33)); // 2진수로 나타내기
		
		int num1 = 33;
		int num2 = 55;
		String strBinNum1 = Integer.toBinaryString(num1);
		String strBinNum2 = Integer.toBinaryString(num2);
		
		int intSum = num1 + num2;
		String strSum = Integer.toBinaryString(intSum);
		
		int length = 50;
		System.out.println(Line.dLine(length));
		System.out.printf("%10s\n", strBinNum1);
		System.out.printf("%10s\n", strBinNum2);
		System.out.println(Line.sLine(length));
		System.out.printf("%10s\n",strSum);		
		System.out.println(Line.dLine(length));
		
	}//end main
}//end class
