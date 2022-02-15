package com.apeach.lecture.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
//		int[] score;
//		
//		int score2[];
//		
//		int [] score3 = {1,2,3,4,5,6,7,8,9,10	};
//		
//		int score4 [] = {4,5,6};
//		
//		double[] score5 = {1,2,3,4};
//		
		String[] strArray = {"장원영","이명희"};
		
//		입력이 되는 데이터 타입이 동일해야한다. 순서는 무조건 0부터시작! index 
//		총갯수를 원할하게 늘릴수 없다.
		
		int[] score = {83 ,90 ,87,99};
		
		System.out.println("score[0] :"+ score[0]);
		System.out.println("score[1] :"+ score[1]);
		System.out.println("score[2] :"+ score[2]);
	
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			sum += score[i];
		
		}
		System.out.println("총합은:"+sum);
		double avg = sum/4.0;
		System.out.println("평균은 : " + avg);
	}
}
