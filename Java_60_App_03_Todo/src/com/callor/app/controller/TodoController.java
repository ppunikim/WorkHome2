package com.callor.app.controller;

import java.util.List;

import com.callor.app.model.TodoVO;
import com.callor.app.service.TodoService;
import com.callor.app.service.impl.TodoServiceImplV1;

public class TodoController {
	public static void main(String[] args) {
		
		TodoService tService = new TodoServiceImplV1();
		tService.todoInsert("오늘은 행복한 목요일");
		List<TodoVO> todoList = tService.todoSelectAll();
		
		for(TodoVO tVO : todoList) {
				System.out.println(tVO.toString());
			}
	}

}
