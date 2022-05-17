package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.callor.app.model.TodoVO;
import com.callor.app.service.TodoService;

public class TodoServiceImplV1 implements TodoService {
	
	protected String saveFileName = "";
	protected final List<TodoVO> todoList;
	
	public TodoServiceImplV1() {
		this("/src/com/callor/app/model/todolist.txt");
	}
	
	
	public TodoServiceImplV1(String string) {
		todoList = new ArrayList<>();
		this.saveFileName = saveFileName;
	
	}

	/* 매개변수로 content(할일) 내용을 전달받아
	 * key, 추가날짜, 시간을 생성한 후에 TodoVO에 담고
	 * todoList에 추가하기
	 * 
	 * java에서 날짜(시간)을 취급하는 방법이 여러가지 있다.
	 * 1.7 이전에는 Date, Calendar 클래스를 사용하여
	 * 날짜와 시간을 취급했다.
	 * 1.8 이후에는 LocalDate, LocalTime, LocalDateTime이라는
	 * 클래스를 사용하여 날짜와 시간을 취급한다.
	 */
	// TODO Todo 추가하기
	@Override
	public void todoInsert(String content) {
		
		/* 컴퓨터의 현재 날짜, 시각 읽어오기
		 * java 1.8에서는 Data 클래스의 생성자에
		 * System.currentTimeMillis() method를 주입해주어야 한다.
		 */
		Date curDate = new Date(System.currentTimeMillis());
		
		/* Data객체의 값을 날짜, 시각 문자열 타입으로
		 * 변경하기 위한 객체 생성
		 */
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		
		/* 현재 날짜, 시각에 해당하는 문자열 생성하기
		 * SimpleDataFormat에 의해서 패턴대로 날짜 시각 문자열을 만든다.
		 */
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);
		/*
		 * Data 관련하여 사용되는 KEY, ID 값
		 * Data의 무결성을 보장하기 위해 모든 데이터(레코드단위, row단위)는
		 * 데이터를 유일하게 식별(구별)할 수 있는 데이터를 가지고 있어야 한다.
		 * 각 언어, DBMS등에서는 고유의 방법으로 ID를 만들고 관리한다.
		 * 
		 * Java에서는 java.util.UUID 클래스를 사용하여
		 * 범 우주적으로 유일한 ID값을 생성하는 도구를 제공한다.
		 */
		UUID uuid = UUID.randomUUID();
		String idStr = uuid.toString();
		
		TodoVO tVO = TodoVO.builder()
							 .tkey(idStr)
							 .sdate(today)
							 .stime(time)
							 .tContent(content)
							 .build();
		todoList.add(tVO); //tVO는 한명에 관련, todoList는 여러명 관련
		
	}

	// TODO 전체 TodoList 조회하기 
	@Override
	public List<TodoVO> todoSelectAll() {
		
		return todoList;
	}

	// TODO key값으로 1개의 todoList 조회하기
	@Override
	public TodoVO findByKey(String key) {
		
		return null;
	}

	// TODO 할 일을 완료했을 때 사용
	public void update(TodoVO tVO) {
		
	}

	// TODO 값 저장하는 용도
	@Override
	public void saveTodo(String fileName) throws IOException {
		
		FileWriter writer = null;
		PrintWriter out = null;
		
		writer = new FileWriter(saveFileName);
		out = new PrintWriter(writer);
		
		for(TodoVO vo : todoList) {
			out.printf("%s",vo.getTkey());
			out.printf("%s", vo.getSdate());
			out.printf("%s", vo.getStime());
			out.printf("%s", vo.getEdate());
			out.printf("%s", vo.getEtime());
			out.printf("%s", vo.getTContent());
		}//end for
		// buffer 에 남아있는 데이터를 강제로 파일에 기록
		// 이 코드는 꼭 안써도 된다.
		out.flush();
	
		/* 열려있는 파일 resource 담기
		 * 파일에 저장하는 코드에서는
		 * 반드시 마지막에 close 해줘야 한다.
		 */
		out.close();
		writer.close();
	}//end saveTodo
	
	
	// TODO TodoList 내용을 파일에 저장하기
	@Override
	public void compTodo(Integer num) {
		
	}


	// TODO 할 일 변경하기
	@Override
	public void update(Integer num, String content) {
		
	}
	

}//end class
