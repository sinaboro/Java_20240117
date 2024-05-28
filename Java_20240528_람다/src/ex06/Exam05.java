package ex06;

interface SumArrA {
	int sumArr(int[] arr);
}

public class Exam05 {

	public static void main(String[] args) {

		SumArrA sumA = new SumArrA() {
			
			@Override
			public int sumArr(int[] arr) {
				int sum = 0;

				for(int i : arr) 

					sum += i;

				return sum;
			}
		};
		
		int[] arr = {1,2,3,4,5};
		int result = sumA.sumArr(arr);
		System.out.println(result);
	}
}
