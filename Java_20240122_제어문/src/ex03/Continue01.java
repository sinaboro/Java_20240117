package ex03;

public class Continue01 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 1)
				sum += i;
		}
		System.out.println("홀수 합 : " + sum);
		
		System.out.println("-------------------------------------------");
		
		int sum2=0;
		for(int i=1; i<=10; i+=2) {
			sum2 += i;
		}
		System.out.println("홀수 합 : " + sum2);
		
		System.out.println("-------------------------------------------");

		int sum3=0;
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 0) 
				continue;
			
			sum3 += i;
		}
		System.out.println("홀수 합 : " + sum3);
		
	}

}
