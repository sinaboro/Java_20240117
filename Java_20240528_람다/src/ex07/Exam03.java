package ex07;

import java.util.function.Function;

interface SquareA {
	int square(int x);
}

public class Exam03 {

	public static void main(String[] args) {

		SquareA sq = x -> x*x;			
		
		System.out.println(sq.square(5));
		
	    System.out.println("------------------------");
	    
	    Function<Integer, Integer> f = (a) -> a*a*a;
	    
	    int result =  f.apply(3);
	    System.out.println(result);
	    
	}

}
