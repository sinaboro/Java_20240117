package ex07;

import java.util.Scanner;
import java.util.function.Predicate;

public class Exam07 {

	public static void main(String[] args) {
		
		Predicate<Integer> pre = num ->  num > 0 ? true : false;
		
		System.out.println("정수 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		String result = pre.test(number)  == true  ? "양수" : "음수";
		
		System.out.println(result);
		
		
		
		
		
	}

}
