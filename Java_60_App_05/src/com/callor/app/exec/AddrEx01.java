package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class AddrEx01 {
	public static void main(String[] args) {
		
		AddressVO hong = new AddressVO();
		AddressVO lee = new AddressVO();
		AddressVO sung = new AddressVO();  //객체 인스턴스 생성하기
		
		hong.setName("sunny");
		hong.setTel("010-222-1111");
		hong.setAddr("busan");
		
		lee.setName("ppuni");
		lee.setTel("010-1212-1212");
		lee.setAddr("gwang");
		
		sung.setName("haet");
		sung.setTel("010-222-4444");
		sung.setAddr("mokpo");
		
		System.out.println(hong.toString());
		System.out.println(lee.toString());
		System.out.println(sung.toString());
		
		
	}//end main
}
