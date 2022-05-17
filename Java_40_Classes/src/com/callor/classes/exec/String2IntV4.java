package com.callor.classes.exec;

public class String2IntV4 {
	public static void main(String[] args) {
		
		//숫자 앞에 + 나 - 가 있는 경우는 정상변환 된다.
		String strNum = "-4";
		strNum = "+3";
		System.out.println(strNum);
		
		// + , - 이외 기호는 NumberFormatException이 뜬다.
		strNum = "*3";
		int intNum = Integer.valueOf(strNum);
		System.out.println(intNum);
		
		
		
	}

}
