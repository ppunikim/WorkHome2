package com.callor.app;

import com.callor.app.model.BookVO_43;

public class Exec05_44 {
//44 page
	public static void main(String[] args) {
		
		BookVO_43[] bookVO = new BookVO_43[10];
		int index = 2;
		bookVO[index] = new BookVO_43();	//이 과정을 하지 않으면 nullpointerexception이 난다.
		bookVO[index].setTitle("java 의 정석");
		bookVO[index].setComp("도울 출판사");
		
		System.out.println("도서명 : "+ bookVO[index].getTitle());
		System.out.println("출판사 : "+ bookVO[index].getComp());
		
		
		
		
	}//end main
}//end class
