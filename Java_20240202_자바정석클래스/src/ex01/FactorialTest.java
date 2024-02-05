package ex01;

public class FactorialTest {

	public static void main(String[] args) {

		int result = factorial(5);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		
		return n==1 ?  1 : n*factorial(n-1);
	}

}
