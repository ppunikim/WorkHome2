package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec03 {
	public static void main(String[] args) {
		
		List<BookVO> bookList = new ArrayList<>();
		for(int i = 0; i < 10; i ++) {
			BookVO bookVO = new BookVO();
			bookVO.setTitle("do it java");
			bookVO.setComp("이지즈 ");
			bookList.add(bookVO);
			//완성했는지 모르겠음
			
		}
	}//end main
}
