package ex03;

import java.util.Scanner;

public class IfExam04 {

	public static void main(String[] args) {
		
		/*
		 * 세 정수 입력받아서 최대값 구하기
		 */
		
		int num1 = 50, num2 = 9, num3 = 150;
		
		int max;
		
		max = num1;
		
		if(max > num2) {
			if(num3 > max) {
				max = num3;
			}
		}else {
			if(num2 > num3) {
				max = num2;
			}else {
				max = num3;
			}
		}
		
		
		System.out.println("최대값 : " + max);
	}

}



