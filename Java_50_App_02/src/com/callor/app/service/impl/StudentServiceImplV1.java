package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.StudentVO;
import com.callor.app.service.StudentService;

public class StudentServiceImplV1 implements StudentService{

	private final List<StudentVO> stList;
	private final String stFileName;
	
	public StudentServiceImplV1() {
		List<StudentVO> sts = new ArrayList<>();
		this.stList = sts;
		this.stFileName = "";
	}//초기화 코드가 상당히 복잡해서 보통은 기본생성자를 안쓰고
	// 임의생성자만 쓴다.
	
	
	
	public StudentServiceImplV1(List<StudentVO> stList, String stFileName) {
		super();
		this.stList = stList;
		this.stFileName = stFileName;
	}



	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StudentVO> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO findByStNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findByStName(String stName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
