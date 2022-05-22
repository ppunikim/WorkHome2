package com.callor.app;


import com.callor.app.model.AddressVO_48;

public class AddrEx01_48 {
//48 page
	public static void main(String[] args) {
		
	AddressVO_48 hong = new AddressVO_48();
	AddressVO_48 lee = new AddressVO_48();
	AddressVO_48 sung = new AddressVO_48();
	
	hong.setStName("햇살");
	hong.setIntAge(23);
	hong.setStAddr("광주광역시");
	
	lee.setStName("가온");
	lee.setIntAge(26);

	sung.setStName("뿌니");
	sung.setIntAge(13);
	
	System.out.println(hong);
	System.out.println(lee);
	System.out.println(sung);
	
	
	}//end main
}//end class
