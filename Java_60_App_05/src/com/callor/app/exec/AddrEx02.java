package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx02 {
	public static void main(String[] args) {
		
		AddressVO data1 = AddressVO.builder() 		
				//service에서 매개변수로 지정해 줬으므로 
								  .name("douner")
								  .addr("gwang")
								  .build(); 		//hong이라는 곳에 데이터추가

		AddrServiceV1 adServiceV1 = new AddrServiceV1(); 
		adServiceV1.printAddr(data1);
		//아까 지정한 AddressVO에 있는 변수 명을 가져온다.
		
		
		
	}//end main
}
