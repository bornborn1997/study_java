package com.apeach.lecture.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
//		int[] score = {83 ,90 ,87,99};
		int [] arr1 = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]: " + arr1[i]);
		}
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]: " + arr1[i]);
		}
		
	
	}

}
