package com.callor.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookVO {
	
	private String title;
	private String comp;  //company
	private String author;
	private String pubDate;
	private int price;
}
