package ex05;

/*
 *다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명
하시오.
	a. int[] arr[];
	b. int[] arr =  {1,2,3,} ;
	c. int[] arr = new int[5];
	d. int[] arr = new int[5]{ 1,2,3,4,5 };
	e. int arr[5];
	f. int[] arr[] = new int[3][];
 */
public class Exam08 {

	public static void main(String[] args) {

		int[]  arr[];
		
		int[] arr2 =  {1,2,3} ;
		
		System.out.println(arr2.length);
		
		int[] arr3 = new int[5];
		
		int[] arr4 = new int[]{ 1,2,3,4,5} ;
		
		int arr5[];
		
		int[] arr6[] = new int[3][];

	}

}
