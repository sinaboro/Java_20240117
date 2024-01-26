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
		
	
		String str  = "김대철";
		int age  = 20;
		double b = 123.12431221321;
		
		System.out.println("이름 : " + str);
		System.out.println("나이 : " + age);
		System.out.println(b);
		
		System.out.println(Math.PI);
		
		int x = 1;
		int y = 5^2;
		
		if(x > 5) 
			System.out.println("x : " + x);
		
		System.out.println(y);
		
		
	 	if(0 <= x && x< 10)  ;  // if( 0<= x <10)
		       
		
				
	}

	static int findMax(int[] arr) {
		
		int max=0;
		
		for(int i=0; i<arr.length; i++)
			if(max < arr[i])
				max = arr[i];
		
		return max;
	}
}
