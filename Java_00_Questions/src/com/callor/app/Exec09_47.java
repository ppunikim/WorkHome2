package com.callor.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exec09_47 {
//47 page -> fileReader와 buffer를 이용한 것.
	public static void main(String[] args) {
		String fileName = "src/com/callor/app/model/data_47.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				System.out.println(reader);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
