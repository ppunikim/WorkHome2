package com.callor.app.exec;

public class Exec04 {
	public static void main(String[] args) {
		
		String str1 = "A";
		String str2 = "B";
		
		int comp = str1.compareTo(str2);
		System.out.println(comp); 		// a를 b 로 비교했을 때 a가 1번째이고, b가 2번째이므로 -1이다.
		System.out.println();
		String[] strs = {"e", "x", "o", "a" , "n"};
		for(String str : strs) {
			System.out.printf("%s\t",str);
		}
		for(int i = 0; i < strs.length; i ++ ) {
			for(int j = i + 1; j < strs.length ; j ++) {
				if(strs[i].compareTo(strs[j]) > 0) {
					String _temp = strs[j];
					strs[j] = strs[i];
					strs[i] = _temp;
				}
			}
		}//end for
		System.out.println();
		for(String str : strs) {
			System.out.printf("%s\t",str);
		}
		
		
		
		
	}//end main
}//end class
