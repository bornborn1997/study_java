package com.apeach.lecture.ch06;

public class ForthCalculatorExample {

	public static void main(String[] args) {
		
		double result1 = 10 * 10 * ForthCalculator.pi;
		int result2 =  ForthCalculator.plus(10,5);
		int result3 =  ForthCalculator.minus(10,20);
		
		System.out.println("사각형의 넓이:" + result1);
		System.out.println("사각형의 넓이:" + result2);
		System.out.println("사각형의 넓이:" + result3);
		

	}

}
