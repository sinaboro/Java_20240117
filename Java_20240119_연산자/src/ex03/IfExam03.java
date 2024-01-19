package ex03;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		
		/*
		 * 두 정수 입력 받아서  5, 10
		 * 큰 값, 작은값으로 출력 
		 * 큰 값 : 10
		 * 작은 값 : 5
		 */
		
		Scanner input =  new Scanner(System.in);
		
		System.out.print("정수 입력1 : ");
		int num1 = input.nextInt();

		System.out.print("정수 입력2 : ");
		int num2 = input.nextInt();
		
		if(num1 > num2) {
			System.out.println("큰 값 : " + num1);
			System.out.println("작은 값 : " + num2);
		}else if(num2 > num1) {
			System.out.println("큰 값 : " + num2);
			System.out.println("작은 값 : " + num1);
		}else {
			System.out.println("두 수 같니?");
		}
	}

}



