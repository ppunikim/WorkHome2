package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.utils.Line;

public class Exec02 {
	public static void main(String[] args) {
		
		AddressVO[] addrs = new AddressVO[4];
		
		addrs[0] = new AddressVO();
		addrs[0].setName("호랑이");
		addrs[0].setAge(30);
		
		addrs[1] = AddressVO.builder().name("매미").age(40).build();
		
		for(int i = 2; i < addrs.length; i ++) {
			addrs[i] = new AddressVO();
		}
		
		addrs[2].setName("가자미");
		addrs[2].setAge(3);
		
		for(AddressVO addr : addrs) {
			System.out.println(addr.toString());
		}
		System.out.println(Line.dLine(60));
		
		int size = addrs.length;
		for(int i = 0; i < size; i ++) {
			for(int j = i + 1; j < size; j ++) {
				if(addrs[i].getAge() > addrs[j].getAge()) {
					AddressVO _temp = addrs[i];
					addrs[i] = addrs[j];
					addrs[j] = _temp;
				}
			}
		}//end for
		for(AddressVO adVO : addrs) {
			System.out.println(adVO);
		}
		
		
	}//end main
}//end class
