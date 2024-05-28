package ex06;

interface EmptyArrA {
	int[] emptyArr();
}

public class Exam06 {

	public static void main(String[] args) {

		EmptyArrA a = new EmptyArrA() {
			
			@Override
			public int[] emptyArr() {
				return new int[] {};
			}
		};
		
		int[] ar = a.emptyArr();
	}
}
