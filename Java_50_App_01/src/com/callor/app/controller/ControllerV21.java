package com.callor.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ServiceV2;

public class ControllerV21 {
	public static void main(String[] args) {
		
		/* 1. scoreList에는 실제 데이터가 저장될 곳의
		 * 		주소만 담겨있는 상태
		 */
		List<Integer> scoreList = new ArrayList<Integer>();
		
		// 2. scoreList의 주소를 생성자의 매개변수로 주입하기.
		ServiceV2 scV2 = new ServiceV2(scoreList);
		
		/* 3. scoreList의 주소를 전달받은 intList에
		 * 		10개의 데이터 추가하기
		 * 즉, getScore가 return 한 값을 scoreList 변수에 한번 더 담았다.
		 */
		scoreList = scV2.getScore(10);
		
		/* print method에 객체를 매개변수로 전달하면,
		 * print() 내부에서 객체.tiString() 명령을 수행하고
		 * 결과를 출력한다.
		 * 
		 * 4. ServiceV2 의 getScore()가 추가된 데이터를
		 * 		바라보고 있는 scoreList를 출력.
		 * 
		 * 5. scoreList와 intList는 같은 데이터를 바라보고 있기 때문에
		 * 		ServiceV2.getScore()가 추가한 데이터를
		 * 		controller에서 출력할 수 있다.
		 */
		System.out.println(scoreList.toString());
		System.out.println(scoreList);// 위 코드와 같은 말이다.
										// toString()은 생략된 상태이다.
		
		
	
	}//end main
}//end class
