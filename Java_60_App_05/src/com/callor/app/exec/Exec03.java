package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;

public class Exec03 {
	public static void main(String[] args) {
		// 리스트, 이름 순으로 정렬
		List<AddressVO> adList = new ArrayList<>();
		AddressVO adVO = new AddressVO();
		
		adVO.setName("하마");
		adVO.setAge(1000);
		adList.add(adVO);
		
		adVO = new AddressVO();
		adVO.setName("매미");
		adVO.setAge(1);
		adList.add(adVO);
		
		adVO = new AddressVO();
		adVO.setName("가자미");
		adVO.setAge(50);
		
		adList.add(AddressVO.builder().name("나비").age(600).build());
		adList.add(new AddressVO());	//한 개의 빈 데이터 만들기
		
		int size = adList.size();
		adList.get(size - 1).setName("자동차");
		adList.get(size - 1).setAge(70000);
		
		
		for(AddressVO adVOs : adList) {
			System.out.println(adVOs);
		}//이때까지 포함한 데이터 보여주기
		
		size = adList.size();
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j ++) {
				if(adList.get(i).getName().compareTo(adList.get(j).getName()) > 0) {
					AddressVO _temp = adList.get(i);
					adList.set(i, adList.get(j));
					adList.set(j, _temp);
				}
			}
		}//end for
		System.out.println();
		for(AddressVO adVOs : adList) {
			System.out.println(adVOs);
		}// 이름 순으로 정렬
		
		
		
	}//end main
}//end class
