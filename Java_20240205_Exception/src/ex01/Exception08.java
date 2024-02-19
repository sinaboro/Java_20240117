package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception08 {
    
	public static void main(String[] args) throws Exception {
	
		
		func1();
		
		System.out.println("main 프로그램 종료");
	}
	
	static void func1() throws Exception{
		
		int[] num = new int[3];
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a/b);
		
		num[4] = 4;
			
		
		
		System.out.println("func1 프로그램 종료");
	}
}
