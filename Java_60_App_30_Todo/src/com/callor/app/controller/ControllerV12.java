package com.callor.app.controller;

import java.util.List;

import com.callor.app.model.TodoVO;
import com.callor.app.service.InputService;
import com.callor.app.service.TodoService;
import com.callor.app.service.impl.InputServiceImplV1;
import com.callor.app.service.impl.TodoServiceImplV1;
import com.callor.app.utils.Line;

public class ControllerV12 {
	public static void main(String[] args) {
		
		TodoService toService = new TodoServiceImplV1();
		InputService inService = new InputServiceImplV1();
		
		while(true) {
			Integer mainMenu = inService.menu(); // 메뉴의 번호 선택하는 것이니까
									// Integer 즉, 참조변수를 사용한다.
			if(mainMenu == null) {
				System.out.println("업무 선택을 다시 하세요");
				continue;
			}
			if(mainMenu == 1) {
				while(true) {
					String content = inService.inputContent();
					if(content.equals("QUIT")) {
						break;
					}
					toService.todoInsert(content);
				  // continue 쓰지 않아도 true이기 때문에
				} // break 만나기 전까지 계속 이어간다.
			} else if(mainMenu == 2) {
				List<TodoVO> todoList = toService.todoSelectAll();
				printTodo(todoList);
			}
		}
		
		
		
		
	}//end main

	private static void printTodo(List<TodoVO> toVO) {
		System.out.println(Line.dLine(50));
		System.out.print("No\t");
		System.out.print("시작일자\t");
		System.out.print("시작시간\t");
		System.out.print("할일\t");
		System.out.println("상태");
		System.out.println(Line.sLine(50));
		int size = toVO.size();
		for(int i = 0; i < size ; i ++) {
			System.out.printf("%s\t",i + 1);
			System.out.print(toVO.get(i).getSdate() + "\t");
			System.out.print(toVO.get(i).getStime() + "\t");
			System.out.print(toVO.get(i).getTContent() + "\t");
			
			String comp = toVO.get(i).getEdate()
					== null || toVO.get(i).getEdate().isBlank()
					? "진행중" : "완료됨";
			System.out.println(comp); 
						// 끝난시간에 문자가 한개라도 있으면 완료됨 표시
						// 없으면( null , "" ) 진행중 표시
		}//end for
	}//end printTodo
}//end class
















