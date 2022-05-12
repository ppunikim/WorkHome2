package com.callor.app.service;

public interface InputService {
	/*
	 * Scanner를 사용해서 키보드에서
	 * 입력받는 일을 대신 수행할 클래스 정의
	 */
	public Integer menu();
	public String inputContent();
	public Integer selectTodo();
}
