package ex02;

/*
 * 메소드: calculateEvenSum
 * 매개변수 : int
 * 반환타입 : int
 * 기능 : 주어진 정수 N까지의 모든 짝수의 합을 계산하는 함수를 작성하세요.
 */

public class Exam03 {

	public static void main(String[] args) {
		
		int total = calculateEvenSum(100);
		System.out.println(total);
		
		int num=10;
		
	}

	static int calculateEvenSum(final int num) {
		int sum=0;
		
		for(int i=0; i<=num; i++)
			if(i % 2 ==0)
				sum +=i;
		
		return sum;
	}
	
}
