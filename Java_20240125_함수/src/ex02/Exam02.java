package ex02;

/*
 * 메소드: findMax
 * 매개변수 : int[]
 * 반환타입 : int
 * 기능 : 정수 배열(5개짜리 배열)을 입력받아 배열 내의 최대값을 찾아 반환합니다.
 */

public class Exam02 {

	public static void main(String[] args) {
		
		int[] arrNum = {20,40,100,50,90};
		
		int num = findMax(arrNum);
		
		System.out.println("max : " + num);
	}

	static int findMax(int[] arr) {
		
		int max=0;
		
		for(int i=0; i<arr.length; i++)
			if(max < arr[i])
				max = arr[i];
		
		return max;
	}
}
