package com.apeach.lecture.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		System.out.println("charcode :" + charCode);
		
		if ( (charCode>=65)&(charCode<=90)) {
			System.out.println("대문자 이군요");
		}
		if ( (charCode>=97)&&(charCode<=122)) {
			System.out.println("소문자 이군요");
		}
		if ( !(charCode<48)&& !(charCode>57)) {
			System.out.println("0~9숫자 이군요");
		}

		int value = 6;
		if( (value%2==
	}

}
