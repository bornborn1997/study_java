package com.apeach.lecture.ch03;

public class StringConcatExample {

	public static void main(String[] args) {
		
		String str1 = "jdk" +1.8;
		String str2 = str1 + "입니다.";
		
		System.out.println("str2 :" + str2);
		
		String strA = "이명희 :";
		String strB = " 01066076676";
		String strC = strA + strB +" 입니다.";

		System.out.println("strC :" + strC);
		

	}

}
