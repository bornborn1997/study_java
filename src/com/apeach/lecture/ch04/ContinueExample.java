package com.apeach.lecture.ch04;

public class ContinueExample {

	public static void main(String[] args) {
//		for(int i =1; i <=10; i++) {
//			if(1%2 !=0) {
//				continue;
//			}
//			System.out.println(i);
		
		int a =1 ;
		
		while(a<=10) {
			if(a%2 ==0) {
				continue;
			}
			
			System.out.println(a);
			a++;
		}

	}

}
