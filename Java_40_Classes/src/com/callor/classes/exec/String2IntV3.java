package com.callor.classes.exec;

public class String2IntV3 {
	public static void main(String[] args) {
		
		/* NumberFormatException이 발생하는 상황들
		 * (숫자형 포맷 오류 발생)
		 * : 문자를 숫자로 변경시도 하다가 에러가 발생하는 경우
		 */
		
		//1. 숫자와 함께 숫자가 아닌 문자열(space)이 포함된 경우
		String strNum = "33";
		int intNum = Integer.valueOf(strNum);
		
		//2. ""(없는 문자열)
		strNum = "";
		intNum = Integer.valueOf(strNum);
		
		//3. 숫자 앞 뒤에 문자열이 포함된 경우
		strNum = "A3A";
		
		//4. 숫자 중간에 문자열이 포함된 경우
		strNum = "3  3";
		
		//5. 숫자 중간에 연산 기호가 포함된 경우
		strNum = "4+4";
		
	}

}
