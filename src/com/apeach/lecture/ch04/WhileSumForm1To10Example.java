package com.apeach.lecture.ch04;

public class WhileSumForm1To10Example {

	public static void main(String[] args) {
		int i = 1; 
		int sum = 0;
		while(i<=10) {		
			System.out.println(i);
			sum += i;
			i++;	
					
		}
		System.out.print("1~10까지의합:" + sum);
	}

}
