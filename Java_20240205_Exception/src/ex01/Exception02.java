package ex01;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		 int sum = func1();
		 
		 System.out.println("두 수 합은 : " + sum);
	}
	
	static int func1() {
		return   func2();
		
	}
	
	static int func2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력 >> ");
		
		// 문자 입력해해서 예외가 발행하면 어떻게 처리???? ==> 1> 내부에서 해결, 2> 예외 던지기
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		return num1+num2;
	}

}
