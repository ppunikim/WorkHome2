package com.callor.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ServiceV2;

public class ControllerV2 {
	public static void main(String[] args) {
		
		/*
		 * ServiceV2에는 기본 생성자가 없기 때문에
		 * 기본 생성자를 호출하여 인스턴스를 생성할 수 없다.
		 * 그 이유는 ServiceV2에서는 내부에서 사용하는
		 * intList를 초기화하는 코드가 없고
		 * ServiceV2를 호출하는 외부에서(Controller) 초기화된
		 * list를 매개변수로 주입해서 사용해야 하기 때문
		 */
		
		List<Integer> scoreList = new ArrayList<>();
		ServiceV2 sV2 = new ServiceV2(scoreList);
		
		List<Integer> list1 = new ArrayList<>();
		ServiceV2 sV3 = new ServiceV2
				
				
				(list1);
		
		
	}//end main
}//end class
