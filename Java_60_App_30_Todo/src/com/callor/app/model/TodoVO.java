package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoVO {
	private String tkey;
	private String tContent;
	private String sdate;
	private String stime;

	private String edate;
	private String etime;

	private boolean bComp;
	
	
	@Override
	public String toString() {
		String result = String.format("%s\t",tkey);
		result += String.format("%s\t", sdate);
		result += String.format("%s\t", stime);
		
		
		String compStr = edate == null || edate.isEmpty() 
				? "진행중" : "완료됨";
		
		if(edate == null || edate.isEmpty()) {
			compStr = "진행중~~";
		} else {
			compStr = "~~완료됨";
		}
		
		result += String.format("%s\t",tContent);
		result += String.format("%s",compStr);
		return result;
	}
	
	
	
	
}//end class



