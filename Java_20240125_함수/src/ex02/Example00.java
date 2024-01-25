package ex02;

import java.util.Scanner;

public class Example00 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		String result = method(num);
		System.out.println(result);

		num = sc.nextInt();
		result = method(num);
		System.out.println(result);
		
		num = sc.nextInt();
		result = method(num);
		System.out.println(result);
	
	}
	
	static String method(int num) {
		if(num%2==0) 
			return "짝수";
		else
			return "홀수";
	}

}
