package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception06 {
    
	public static void main(String[] args) throws InputMismatchException{
	
		func1();
		
		System.out.println("main 프로그램 종료");
	}
	
	static void func1() {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3]; //0 1 2
		
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a/b);
			
			num[4] = 4;
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//예외가 발생하든 하지않든 무조건 처리하는 문장
		}
		
		System.out.println("func1 프로그램 종료");
	}
}
