package ex03;

/*
 * 2>
	1~100 사이에
	3의 배수이면서 5의 배수 합 구하고,  
	갯수 구하기
 */
public class 배수3과5의배수합구하기 {

	public static void main(String[] args) {
		
		int sum=0;
		int count=0;
		
		for(int i=1; i < 101; i++) {
			
			if( i%3 == 0 && i%5 == 0) {
				sum += i;    //15, 30, 45, 60, 75, 90
				count++;
			}
		}
		
		
		System.out.println("3과5의 배수 합은 : " + sum);
		System.out.println("3과5의 배수 갯수는 : " + count);

	}

}
