package ex07;

import java.util.function.Supplier;

@FunctionalInterface
interface EmptyArrA {
	int[] emptyArr();
}

public class Exam06 {

	public static void main(String[] args) {

		EmptyArrA a = () -> new int[] {};		
		
		int[] ar = a.emptyArr();
		
		System.out.println("---------------");
		
		Supplier<int[]> s = () -> new int[] {};
		
		System.out.println(s.get());
		
	}
}
