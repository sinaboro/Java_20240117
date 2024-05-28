package ex06;

interface SquareA {
	int square(int x);
}

public class Exam03 {

	public static void main(String[] args) {

		SquareA sq = new SquareA() {
			
			@Override
			public int square(int x) {
				return x*x;
			}
		};		
		
		System.out.println(sq.square(5));
	}

}
