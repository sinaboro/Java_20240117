package ex01;

/*
 * 메소드 : max
 * 매개변수 : int,int
 * 반환 : int
 * 두 수 입력받아서 최대값 출력
 */
public class 반환있고매개변수있음 {

	public static void main(String[] args) {
		
		System.out.println("최대값 출력");
	
		int max = max(25, 10);
		
		System.out.println("최대값 : " + max);
		System.out.println("프로그램 종료!");

	}
	
	static int max(int num1, int num2) {
		
		if(num1> num2)
			return num1;
		else 
			return num2;
	}

}
