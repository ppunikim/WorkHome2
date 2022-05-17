package com.callor.app.service.impl;

import com.callor.app.utils.Line;

public class InputServiceImplV2 extends InputServiceImplV1 {

	public InputServiceImplV2() {
		super();
	}// end 생성자

	@Override
	public String inputContent() {
		System.out.print("할 일(QUIT:종료) >> ");
		String content = scan.nextLine();
		return content;
	}
	
	
	@Override
	public Integer selectTodo() {
		System.out.println(Line.dLine(50));
		System.out.println("할 일 선택하시오.(QUIT:종료) >> ");

		String selectNum = scan.nextLine();
		Integer intNum = 0;

		if (selectNum.equals("QUIT"))
			return -1;

		try {
			intNum = Integer.valueOf(selectNum);
		} catch (Exception e) {
			return null;
		}

		return intNum;
	}//end selectTodo

}
