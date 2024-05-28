package ex06;


interface MaxA{
	int max(int a, int b);
}

public class Exam01 {

	public static void main(String[] args) {
		
		
		//익명 객체..
		MaxA result = new MaxA() {			
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
		System.out.println(result.max(10, 3));
	}

}
