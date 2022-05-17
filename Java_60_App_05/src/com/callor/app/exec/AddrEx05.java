package com.callor.app.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;
import com.callor.utils.Line;

import lombok.Getter;

public class AddrEx05 {
	public static void main(String[] args) {
		
		List<AddressVO> addrs = new ArrayList<>(); //여러 VO 저장
		AddressVO adVO = new AddressVO(); //한명의 VO 저장
		
		adVO.setName("sun");
		adVO.setAddr("sky");
		adVO.setAge(300000);			//VO에서 한 명의 데이터 추가
		addrs.add(adVO);		//리스트에 VO내용 추가하기
		
		adVO = new AddressVO();	//초기화 시키기
		adVO.setName("moon");
		adVO.setAddr("sky");
		adVO.setAge(4000);
		addrs.add(adVO);
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addrs);			//service에서는 콘솔에 출력하는 역할
		
		System.out.println(Line.dLine(80));		// 데이터를 보기 편하게 만듦.
		
		adVO = AddressVO.builder()			//VO클래스에서 한 명의 데이터 만들기
						.name("sea")
						.age(500000)
						.addr("ground")
						.build();
		addrs.set(1, adVO);					//1번 배열의 데이터VO를 List에 추가 
		adService.printAddrList(addrs);		// service에서는 데이터 콘솔에 출력
		
		
	/*	System.out.println(Line.dLine(50));
		for(int i = 0; i < addList.size(); i ++) {
			System.out.println(addList.get(i)); 	//리스트를 그냥 가져오거나
		}*/
		
		System.out.println(Line.dLine(50));
		System.out.println(Line.dLine(50));
		
		adService.printAddrList(addrs);
		
	}
}
