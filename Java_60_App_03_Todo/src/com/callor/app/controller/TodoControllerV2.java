package com.callor.app.controller;

import java.util.List;

import com.callor.app.model.TodoVO;
import com.callor.app.service.TodoService;
import com.callor.app.service.impl.TodoServiceImplV2;

public class TodoControllerV2 {
	
	public static void main(String[] args) {
		
		TodoService toService = new TodoServiceImplV2();
		List<TodoVO> todoList = toService.todoSelectAll();	
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
	}

}
