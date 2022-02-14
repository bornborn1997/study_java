package com.apeach.lecture.ch04;
import java.util.Random;

public class Test3 {

	public static void main(String[] args) {
		 System.out.println("유경이를위한 로또번호");
        Random rand = new Random();       
        int[] arr = new int[6];        
        for(int i=0; i<6; i++) {

            arr[i] = rand.nextInt(45)+1;
            //랜덤을 돌리면 중복된 숫자 발생
            //중복제거
            for(int j=0; j<i; j++) {

                if(arr[i] == arr[j]) {

                    i--;
                }
            }
        }        
        for(int i=0; i<6; i++) {
        
            System.out.println(arr[i]);

        }
       
	}

}
