package GJtesttest;

public class Computer {
	Calculator calculator = new Calculator ();
	public void Area(double radius) {
		
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적 :" + radius * radius * calculator.PAI_2);
		
		
}
}