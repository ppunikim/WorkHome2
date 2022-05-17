package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx03 {
	public static void main(String[] args) {
		
		// AddressVO에서 addrs에 0번 ~ 2번 데이터 저장 
		AddressVO[] addrs = new AddressVO[10];
		addrs[0] = AddressVO.builder().name("ppuni")
									  .addr("here")
									  .age(30)
									  .build();
		addrs[1] = new AddressVO();
		addrs[1].setName("sun");
		addrs[1].setAge(12);
		
		addrs[2] = new AddressVO();
		addrs[2].setName("moon");
		addrs[2].setAge(32);
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addrs); //addrs를 매개변수로 전달
				
		//배열의 문제점 : 데이터를 저장하지 않으면 낭비되는 데이터가 많다.
	}//end main
}//end class
