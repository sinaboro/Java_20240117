package ex03;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		
		/*
		 * 1. 숫자 입력 

			2. 이 숫자가 3의 배수이면서 5의 배수이면
			     "좋아요"
			   아니면 "싫어요"

		 */

		
		Scanner input =  new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int number = input.nextInt();
		
		if(number % 3 == 0) {
			if(number % 5 == 0 ) {
				System.out.println("좋아요");
			}else {
				System.out.println("싫어요");
			}
				
		}else if(number % 5 == 0){
			if(number % 3 ==0 ) {
				System.out.println("좋아요");
			}else {
				System.out.println("싫어요");
			}
		
		}else {
			System.out.println("싫어요");
		}
	}

}
