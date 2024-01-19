package ex02;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
	/*	<실행결과>
		숫자1 : 20
		숫자2 : 30
		합계 : 50
		평균 : 25.0
	*/
		
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("숫자1 : ");
	 int su1 = sc.nextInt();

	 System.out.print("숫자2 : ");
	 int su2 = sc.nextInt();
	 
	 
//	 System.out.println("합계 : " + (su1+su2) );
//	 System.out.println("평균 : " + (su1+su2)/2.0 );

	 int sum = su1 + su2;
	 
	 double avg = sum/2.0;
	 
	 System.out.println("합계 : " + sum );
	 System.out.println("평균 : " + avg );
		

	}

}
