package com.apeach.lecture.ch03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		
		int score = 75;
		
		if (score >=90) {
			if (score >=95) {
				System.out.println("등급은 A입니다");
			
			}
			System.out.println("점수가 90~100점사이입니다");
			System.out.println("등급은 A입니다");
		} else if (score >=80) {
			System.out.println("점수가 80~89사이입니다");
			System.out.println("등급은 B입니다.");
			
		}else if (score >=70){
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 C입니다.");
		}else if (score >=60) {
			System.out.println("점수가 60~69입니다");
			System.out.println("등급은 D입니다.교수님이 화났습니다.");
		}else {
		System.out.println("점수가 60미만입니다");
		System.out.println("등급은 F입니다. 재수강하십쇼");
		}
	}	
}

