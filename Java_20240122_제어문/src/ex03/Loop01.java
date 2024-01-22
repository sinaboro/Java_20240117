package ex03;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("5개의 숫자를 입력하세요.");
		Scanner s = new Scanner(System.in);
		
		for (int n = 1; n <= 5; n++) {
			int num = s.nextInt();
			sum += num;         // sum = sum + num과 같은 코드
		}
		
		System.out.println("합계 : " + sum);


	}

}
