package com.callor.app.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.callor.app.model.TodoVO;

public class TodoServiceImplV2 extends TodoServiceImplV1{
	
	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}
	
	/* 저장된 todoList.txt 파일을 읽어서
	 * todoList에 추가하기
	 * 
	 * todoList.txt파일 열기
	 * 열기할 파일은 V1에 saveFileName에 저장되어 있다.
	 * 
	 * 한 라인씩 읽어서
	 * 컴마(,)기준으로 split하고
	 * todoVO에 담고
	 * todoList에 추가
	 * 그러면 V1dml todoList객체가 생생돼있다.
	 */
	protected void loadTodoList() {
		FileInputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(saveFileName);
		} catch (FileNotFoundException e) {
			System.out.println(saveFileName + "파일이 없습니다.");
			return;
		}
		scan = new Scanner(is);
		
		int T_KEY = 0;
		int T_SDATE = 1;
		int T_STIME = 2;
		int T_EDATE = 3;
		int T_ETIME = 4;
		int T_CONTENT = 5;
		
		while(scan.hasNext()) {
			
			// 파일로부터 한 라인을 읽어서 line 변수에 담기
			String line = scan.nextLine();
			
			/* 읽어들인 line을 (,)기준으로 분해(split)
			 * 분해한 결과는 String형 배열이다. 
			 */
			String[] todo = line.split(",");
			
			/* text파일에 데이터를 저장하면 마지막에
			 * 공백 line이 추가되는 경우가 있다.
			 * 이때는 split 으로 분해한 배열의 개수가 부족하게된다.
			 * 이러한 상황을 방지하기 위해 아래 코드를 추가한다.
			 */
			if(todo.length < T_CONTENT + 1) continue;  //이해안됨.
			
			String eDate = todo[T_EDATE];
			String eTime = todo[T_ETIME];
			
			if(eDate.equalsIgnoreCase("null")) eDate = null;
			if(eTime.equalsIgnoreCase("null")) eTime = null;
			
			TodoVO tVO = TodoVO.builder()
										.tkey(todo[T_KEY])
										.sdate(todo[T_SDATE])
										.stime(todo[T_STIME])
										.edate(eDate)
										.etime(eTime)
										.tContent(todo[T_CONTENT])
										.build();
										
			todoList.add(tVO);
		}
		
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//end loadTodoList
	
	@Override
	public void update(Integer num, String content) {

		int index = num - 1;
		TodoVO tVO;
		try {
			tVO = todoList.get(index);
		} catch (Exception e) {
			System.out.println("선택한 항목이 리스트에 없습니다.");
			return;
		}//end try/catch
		
		tVO.setTContent(content);
		
		try {
			this.saveTodo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end update
	
}//end class
