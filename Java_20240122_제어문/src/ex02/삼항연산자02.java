package ex02;

import java.util.Scanner;

/*
 * 버스기본요금은 1500원
	0~3 : 할인율 100%
	4~13 : 할인율 50%
	14~19 : 할인율 25%
	20세이상 : 할인율 0%
	나이 입력하면 할인율 기반해서 프로그램 작성
 */

public class 삼항연산자02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int CHARGE = 1500;
		double fee=0;
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		
		fee = (age >= 20) ? CHARGE * 1: (age >= 14) ? CHARGE * 0.75: (age >= 4) ? CHARGE * 0.5: 0;
		
		System.out.println("당신 요금은 : " + (int)fee + "원");

	}

}
