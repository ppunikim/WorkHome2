package com.callor.classes.exec;

public class String2IntV2 {
	public static void main(String[] args) {
		
		String strNum1 = "100";
		String strNum2 = "200";
		
		String strSum = strNum1 + strNum2;
		System.out.println(strSum);  	//문자열은 이어진다.
		
		
		int intNum1 = Integer.valueOf(strNum1);
		int intNum2 = Integer.valueOf(strNum2);
		int intSum = intNum1 + intNum2;
		System.out.println(intSum);		//정수형으로 바꾸면 덧셈.
		
		strNum1 = "40.2";
		strNum2 = "40.8";
		float fNum1 = Float.valueOf(strNum1);
		float fNum2 = Float.valueOf(strNum2);
		System.out.println(fNum1 + fNum2); // 실수형은 float이다.	
		
		fNum1 = Float.parseFloat(strNum1);
		fNum2 = Float.parseFloat(strNum2);
		System.out.println(fNum1 + fNum2);  // parse와 같다.
		
		
	}//end main
}//end class
