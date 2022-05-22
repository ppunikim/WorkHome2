package com.callor.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exec08_47 {
//47 page -> InputStream 과 Scanner를 이용한 것
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/app/model/data_47.txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(fileName);
			scan = new Scanner(is);
			while(scan.hasNext()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}//end main
}//end class
