package test;

public class Calculator {

Constants constants = new Constants ();

public void Area(double radius) {
	
	System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
	System.out.println("원면적 :" + radius * radius * constants.PAI_1);
	
}
	
}