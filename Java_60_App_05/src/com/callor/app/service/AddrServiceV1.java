package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.utils.Line;

public class AddrServiceV1 {

	int length = 65;
	public void printAddr(AddressVO adVO) { //매개변수로 받아와서
		System.out.println(adVO.toString()); //그것의 문자열을 출력한다.
		System.out.println(Line.sLine(length));
	}//end printAddr
	
	
	public void printAddrList(AddressVO[] addrs) { //배열이면 매개변수도 배열
		for(int i = 0; i < addrs.length; i ++) {
			System.out.println(addrs[i]);
		} 	//확장 for와 같은 의미이다.
		
		System.out.println(Line.dLine(length));
		for(AddressVO vo : addrs) {
			System.out.println(vo);
		}
		System.out.println(Line.sLine(length));
	}

	
	public void printAddrList(List<AddressVO> addList) {
		int size = addList.size(); 	// 리스트는 size이다.
		for(int i = 0; i < size ; i ++) {
			AddressVO adVO = addList.get(i);
			System.out.println(adVO);			//VO를 리스트에 가져오기
		}
		/*
		System.out.println(Line.dLine(50));
		for(AddressVO vo : addList) {
			System.out.println(vo);				//확장for문으로 추가
		}
		System.out.println(Line.dLine(50));
		for(int i = 0; i < addList.size(); i ++) {
			System.out.println(addList.get(i)); 	//리스트를 그냥 가져오거나
		}
		*/
		
		for(int i = 0; i < addList.size(); i++ ) {
			for(int j = i + 1; j < addList.size(); j++ ) {
				if(addList.get(i).getAge() > addList.get(j).getAge()) {
					// j번째 값을 voTong에 담는다. -> j 가 비어있다.
					AddressVO voTong = addList.get(j);
					//(저장할 공간 , 저장할 수)
					addList.set(j, addList.get(i));	//i번째 값을 가져와서 j 공간에 넣는다.
					addList.set(i,voTong); //비어있는 i번째 공간에 j값이 저장돼있는 voTong을 저장
				}
			}
		}//end for
		System.out.print("나이 비교 : ");
		System.out.println(addList);
		
		
		
	}//end printAddrList
	

	
	
}
