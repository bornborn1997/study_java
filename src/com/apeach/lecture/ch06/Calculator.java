package com.apeach.lecture.ch06;

public class Calculator {

		public void powerOn() {
			System.out.println("전원을킵니다.");
		}
		
		public int plus(int a, int b) {
			int result = a+b;
			return result;
		}
		
		public double divide(int x , int y) {
			double result = (double)x/ (double)y;
			return result;
		
		}
		void powerOff() {
			System.out.println("전원을끕니다.");
			
		}
}
		
