package ex03;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
	
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성년입니다.");
		}
		
		if(age < 20) {
			System.out.println("미성년입니다.");
		}

		System.out.println("프로그램 종료");
	}

}
