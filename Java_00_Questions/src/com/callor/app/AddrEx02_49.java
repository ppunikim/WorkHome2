package com.callor.app;

import com.callor.app.model.AddressVO_48;
import com.callor.service.AddrServiceV1_49;

public class AddrEx02_49 {
//49 page
	public static void main(String[] args) {
		
		AddressVO_48 hong = AddressVO_48.builder().stName("sun")
											.intAge(77).build();
		
		AddrServiceV1_49 adService = new AddrServiceV1_49();
		adService.printAddr(hong);
		
		
	}//end main
}//end class
