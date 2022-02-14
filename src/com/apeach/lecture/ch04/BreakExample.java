package com.apeach.lecture.ch04;

public class BreakExample {

	public static void main(String[] args) {
		
		while (true) {
			int num = (int) ((Math.random()*100)+1);
			System.out.println(num);
			if(num == 88) {
				break;
			}
		}
		System.out.println("끝!");
	}

}
