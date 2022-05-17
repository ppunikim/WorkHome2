package com.callor.app.exec;

import com.callor.app.model.TodoVO;
import com.callor.app.utils.Line;

public class VarEx1 {
	public static void main(String[] args) {
		
		//primitive 변수, 기본형 변수
		// 순수하게 값을 저장하는 용도로만 사용하는 변수
		int num1;
		long num2;
		float num3;
		num3 = 30f;
		System.out.println(num3);
		
		
		/*
		 *  클래스 type변수, 참조형 변수
		 *  몇 가지 method가 속성들이 자동으로 생성돼
		 *  사용할수 있도록 미리 구성한다.
		 */
		Integer num4 = 100;
		System.out.println(num4.toString());
		System.out.println(num4 + "");
		
		Long num5;
		Float num6;
		
		TodoVO toVO = new TodoVO();
		toVO.setSdate("2000-02-07");
		
		System.out.println(Line.dLine(40));
		int[] nums = new int[10];
		System.out.println(nums.length);
		
		
		
		
	}//end main

}
