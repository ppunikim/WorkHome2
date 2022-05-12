package com.callor.app.controller;

import java.util.List;

import com.callor.app.model.TodoVO;
import com.callor.app.service.InputService;
import com.callor.app.service.TodoService;
import com.callor.app.service.impl.InputServiceImplV1;
import com.callor.app.service.impl.TodoServiceImplV1;

public class TodoControllerV11 {
	
	public static void main(String[] args) {
		
		TodoService toService = new TodoServiceImplV1();
		InputService inService = new InputServiceImplV1();
		
		while(true) {
			Integer menu = inService.menu();
			if(menu == null) {
				System.out.println("업무 번호를 잘 선택하세요");
				continue;
			}
			if(menu == 6) {
				break;
			} else if(menu == 1) { // 리스트 추가하는 번호
				String content = inService.inputContent(); //할일 입력
				toService.todoInsert(content); //TodoVO에 저장됨
			} else if(menu == 2) {  // 내가 추가한 리스트를 보여주는 번호
				List<TodoVO> todoList = toService.todoSelectAll();
				for(TodoVO vo : todoList) {
					System.out.println(vo.toString());
				}
			}
		}//end while
		System.out.println("업무 종료~  집가자");
	}

}
