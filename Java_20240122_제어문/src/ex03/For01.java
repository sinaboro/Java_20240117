package ex03;

public class For01 {

	public static void main(String[] args) {
		
		//1~10까지 합을 구하는 for문
		
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum = sum + i;
		}
		
		System.out.println("for 누적합 : " + sum);

	}

}
