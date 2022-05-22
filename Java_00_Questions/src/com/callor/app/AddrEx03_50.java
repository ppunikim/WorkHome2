package com.callor.app;

import com.callor.app.model.AddressVO_48;
import com.callor.service.AddrServiceV1_50;

public class AddrEx03_50 {
//50 page
	public static void main(String[] args) {
		
		
		AddressVO_48[] adVO1 = new AddressVO_48[3];
		adVO1[0] = AddressVO_48.builder().stName("sun").intAge(40).build();
		adVO1[1] = new AddressVO_48();
		adVO1[1].setStName("cloud");
		adVO1[1].setIntAge(100);
		
		
		AddrServiceV1_50 adService = new AddrServiceV1_50();
		adService.printAddrList(adVO1);
		
		
	}//end main
}//end class
