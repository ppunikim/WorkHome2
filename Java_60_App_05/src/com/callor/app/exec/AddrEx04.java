package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx04 {
	public static void main(String[] args) {
		
		//리스트 장점 : 낭비하는 데이터 없이, 내가 만들 데이터 양만큼만 만들어진다.
		
		//리스트(여러 VO들이 올 수 있는 공간 만들기)
		List<AddressVO> addList = new ArrayList<>();  

		// 한명(VO)가 올 공간 만들기
		AddressVO adVO = new AddressVO();
		adVO.setName("sun");
		adVO.setAddr("sky");
		adVO.setAge(3);
		addList.add(adVO);		//한명 공간 만들고 추가하기
		
		adVO = new AddressVO();	//초기화 시키기
		adVO.setName("moon");
		adVO.setAddr("sky");
		adVO.setAge(4);
		addList.add(adVO);
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addList);
		
		
		
		
	}//end main
}//end class
