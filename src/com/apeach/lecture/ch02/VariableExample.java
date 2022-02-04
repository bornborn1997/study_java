package com.apeach.lecture.ch02;

public class VariableExample {

	public static void main(String[] args) {
		
		int value = 10;
		
		
		int result = value + 10;
		
		System.out.println("총합은:" + result);		
		
		int a ;
		a=2;
		if(a == 1) {
			int aaa = 10;
			int bbb = aaa + a;
			System.out.println("bbb:" + bbb);
			
		}else { 
			System.out.println("bbb:" + a);
		}
		
	}

}
