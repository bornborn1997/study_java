package com.apeach.lecture.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		
			String str1 = "이명희";
			String str2 = "이명희";
			String str3 = new String("이명희");
			
			boolean result1 = (str1==str2);
			boolean result2 = (str1==str3);
			System.out.println("result1 =" + result1);
			System.out.println("result2 =" + result2);
			
			System.out.println("str1.equals(str2): " + str1.equals(str2));
			System.out.println("str1.equals(str3): " + str1.equals(str3));
			
			
			

	}

}
