package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.InputService;
import com.callor.app.utils.Line;

public class InputServiceImplV1 implements InputService{
	
	protected final Scanner scan;
	public InputServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	@Override
	public Integer menu() {
		
		System.out.println(Line.dLine(50));
		System.out.println("업무를 선택하세요");
		System.out.println(Line.sLine(50));
		System.out.println("1. TODO 추가하기");
		System.out.println("2. TODO List 보기");
		System.out.println("3. TODO 변경하기");
		System.out.println("4. 완료처리하기");
		System.out.println("5. 파일에 저장하기");
		System.out.println("6. 종료하기");
		System.out.println(Line.sLine(50));
		System.out.print("선택 >> ");
		String strMenu = scan.nextLine();
		Integer intMenu = 0;
		
		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			return null;
		}
		return intMenu;
		
		
	}
	
	// 할 일 추가
	@Override
	public String inputContent() {

		System.out.print("할 일(QUIT : 종료) >> ");
		String content = scan.nextLine();
		return content;
	}

	@Override
	public Integer selectTodo() {
		// TODO Auto-generated method stub
		return null;
	}

}
