package com.callor.app;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO_43;

public class Exec03_43 {
//43 page
	public static void main(String[] args) {
		
		List<BookVO_43> bookList = new ArrayList<>();
		for(int i = 0; i < 10; i ++) {
			BookVO_43 bookVO = new BookVO_43();
			bookVO.setTitle("Do it java");
			bookVO.setComp("이지즈퍼블리시");
			bookList.add(bookVO);
		}
		
		
		
		
	}//end main
}//end class
