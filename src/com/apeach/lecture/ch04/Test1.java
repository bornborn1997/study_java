package com.apeach.lecture.ch04;

public class Test1 {

	public static void main(String[] args) {
		int sum = 0; 
		int sum1 = 0; 
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { 
				sum += i; 
			} else { 
				sum1 += i; 
			}
		}
		System.out.println("짝수 합 : " + sum); 
		System.out.println("홀수 합 : " + sum1); 
	}




	}


