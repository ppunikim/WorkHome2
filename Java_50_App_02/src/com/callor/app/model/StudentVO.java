package com.callor.app.model;

/* "클래스 정의(Class prototype define)"
 * 
 * java파일을 생성하고
 * 클래스 키워드를 시작으로 만든 코드.
 * 아직은 사용할 수 없고, 디자인만 돼있다.
 */

public class StudentVO {
	
	private String stNum;
	private String stName;
	private int intGrade;
	private String stDept;
	private String stAddr;
	private String stTel;
	
	/* VO class에 기본 생성자와
	 * 모든 인스턴스 변수(클래스 영역의 변수)를
	 * 매개변수로 받아 초기화하는 임의생성자를 만든다.
	 * 
	 * JDK를 사용하여 프로젝트를 수행할 때
	 * 다양한 도구들을 연결할 필요가 있는데,
	 * 도구들마다 VO객체에 접근하는 방법이 조금씩 다르다.
	 * 어떤 도구는 getter, setter를 통해 접근하기도 하고,
	 * 어떤 도구는 field생성자를 통해 접근하기도 한다.
	 * 
	 *  최근에 getter, setter를 만들지 말라는 의견도 있지만
	 *  다양한 JDK도구를 사용할 때는 필요하기도 하므로
	 *  표준 java코딩의 VO 클래스 작성 패턴에서는
	 *  모든 변수는 private으로 선언하고, 
	 *  getter, setter를 정의해 준다.
	 */
	
	
	public StudentVO() {
		
	}//end 기본생성자
	
	public StudentVO(String stNum, String stName, int intGrade, String stDept, String stAddr, String stTel) {
		super(); //기본생성자의 내용을 가져오는 코드
		this.stNum = stNum;
		this.stName = stName;
		this.intGrade = intGrade;
		this.stDept = stDept;
		this.stAddr = stAddr;
		this.stTel = stTel;
	}//변수 전체를 초기화하는 코드
	
	//getter, setter이다.
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getIntGrade() {
		return intGrade;
	}
	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public String getStAddr() {
		return stAddr;
	}
	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}
	public String getStTel() {
		return stTel;
	}
	public void setStTel(String stTel) {
		this.stTel = stTel;
	}
	
	
	/* VO객체에 데이터를 저장한 후, 저장된 데이터가 잘 담겨 있는지 확인하는
	 * 용도로 사용하기 위해 toString() method를 재정의.
	 */
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", intGrade=" + intGrade + ", stDept=" + stDept
				+ ", stAddr=" + stAddr + ", stTel=" + stTel + "]";
	}
	

}
