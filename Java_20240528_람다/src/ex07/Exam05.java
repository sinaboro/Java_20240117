package ex07;

import java.util.function.Function;

interface SumArrA {
	int sumArr(int[] arr);
}

public class Exam05 {

	public static void main(String[] args) {

		SumArrA sumA = 
			arr -> {
				int sum = 0;

				for(int i : arr)
					sum += i;
				return sum;
			};
		
		int[] arr = {1,2,3,4,5};
		int result = sumA.sumArr(arr);
		System.out.println(result);
		
		System.out.println("----------------------------");
		
		Function<int[], Integer> f = arr2 -> {
			int sum = 0;

			for(int i : arr)
				sum += i;
			return sum;
		};
		int[] arr2 = {10,20,30,40,50};
		int result2 = sumA.sumArr(arr2);
		System.out.println(result2);
		
	}
}
