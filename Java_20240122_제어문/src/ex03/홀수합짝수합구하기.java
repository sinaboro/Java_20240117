package ex03;

/*
 * 1>
	1~100사이에
	홀수합과 짝수합을 구하시요!
 */
public class 홀수합짝수합구하기 {

	public static void main(String[] args) {
		
		int even = 0; //짝수 합
		int odd = 0;  //홀수 합
		
		for(int i=1; i <= 100; i++) {
			
			if(i % 2 == 0)
				even += i; //even = even +i;
			else
				odd += i;
			
		}
		
		System.out.println("짝수 합 : " + even);
		System.out.println("홀수 합 : " + odd);
		
	}

}
