package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.TodoVO;
import com.callor.app.utils.Line;

public class VarEx2 {
	
	public static void main (String[] args) {
		
		List<TodoVO> todoList = new ArrayList<>();
		
		/* Builder 패턴을 사용한 VO 객체 생성
		 * 클래스.builder() 메서드에 의해 VO 객체가 선언되고
		 * 필드 변수로 선언한 것과 같은 이름의
		 * setter method를 사용하여
		 * VO 객체의 각 변수 값을 채워넣으면서
		 * VO 객체를 생성하는 것
		 */
		TodoVO tVO = TodoVO.builder()
						   .tkey("첫 번째")
						   .sdate("2022-03-04")
						   .tContent("과제")
						   .build();
		todoList.add(tVO);
		
		System.out.println(Line.dLine(50));
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		
		
		/* 기본 생성자를 사용하여 객체를 초기화 하고
		 * setter method를 사용하여 각 변수 값 저장하기
		 */
		tVO = new TodoVO();
		tVO.setTkey("두 번째");
		tVO.setSdate("2022=04-06");
		tVO.setTContent("숙제");
		todoList.add(tVO);
		System.out.println(Line.dLine(50));
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		
		/* 필드 생성자를 사용하여 객체 변수를 
		 * 저장하면서 객체 생성하기
		 */
		tVO = new TodoVO("세 번째"
						,"생성자"
						,"2022-05-22"
						,"03:30:50"
						,"" 
						,""
						,false);
		todoList.add(tVO);
		
		System.out.println(Line.dLine(50));
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		
		TodoVO todoVO = todoList.get(0);
		todoVO.setTkey("003");
		todoList.set(0, todoVO);
		
		System.out.println(Line.sLine(50));
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		
		todoList.get(1).setTkey("002");
		System.out.println(Line.sLine(59));
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
			
	}//end main
}
