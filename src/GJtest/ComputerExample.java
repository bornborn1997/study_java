package GJtest;

public class ComputerExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		int a = 7;
		double result1;
		double result2;
		
		System.out.println("원의 반지름: " + a);
		System.out.println();
		
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		result1 = calculator.Area(a);
		System.out.println("원면적: " + result1);
		
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		result2 = computer.Area(a);
		System.out.println("원면적: " + result2);
	}

}
