package ex02;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		int a = 3, b = 4, c = 5;
		int d = (a + b) * c;
		
		System.out.println(d);
		
		/*
		<실행결과>
		
		문자열 입력 : JavaBook
		
		출력 결과 : JavaBook 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String msg = sc.nextLine();
		
		System.out.println("출력 결과 : " + msg);
	}

}
