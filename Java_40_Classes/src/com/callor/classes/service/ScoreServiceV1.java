package com.callor.classes.service;

import java.util.Scanner;

import com.callor.utils.Line;

public class ScoreServiceV1 {
	
	/* 상속을 염두해두고 클래스를 선언할 때는
	 * 인스턴스 변수들을 private가 아닌 protected로 선언한다.
	 * 
	 * protected : 
	 * private의 성질을 가지면서
	 * 상속받은 클래스서 상속받아 변수를 선언한 것과 같은 효과를 낸다
	 * 인스턴스 변수도 상속된다.
	 * 
	 */
	protected String[] students;
	protected int[] intKor;
	protected int lineLength;
	protected Scanner scan;
	
	public ScoreServiceV1() {
		this(10);
	}//end 기본생성자
	
	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor = new int[length];
		lineLength = 50;
		scan = new Scanner(System.in);
	}//end 임의생성자
	
	public int input() {
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("햇살 고교 성적처리 V1");
		System.out.println(Line.sLine(lineLength));
		
		int index = 0;
		for(index = 0; index < students.length; index++) {
			int stNum = index + 1;		// 학생 숫자는 1번부터 시작하므로
			System.out.printf("%d번 학생 이름(END : 중단) = ",stNum);
			//키보드에서 문자열 입력받기
			String strName = scan.nextLine();
			
			//이름 대신 END 문자열을 입력하면 입력받기를 중단한다.
			if(strName.equals("END")) {
				break;
			}
			students[index] = strName;
			
			
			
			System.out.printf("%d 번 국어점수 입력 > ",stNum);
			String strScore = scan.nextLine(); 	//문자로 입력 받아서
			int intScore = 0;
			if(strScore.equals("")) {
				System.out.println("점수는 숫자만 가능");
				break;
			} else {
				intScore = Integer.valueOf(strScore); 	//정수로 저장
			}
			intKor[index] = intScore;
			
		}//end for
		return 0;
	}//end input
	
	public void print() {
		System.out.print("이름은 : ");
		for(int i = 0; i < students.length; i++) {
			System.out.printf("%s\t", students[i]);
		}// 마지막에 이름 출력하는 것
		System.out.println();
		
		System.out.print("점수는 : ");
		for(int nums : intKor) {
			System.out.printf("%s\t",nums);
		}
		System.out.println();
		
	}//end print
	
	
	
	
}//end class
