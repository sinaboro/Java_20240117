package ex04;

public class Array02 {

	public static void main(String[] args) {
		
		//1. int형 배열 생성후 랜덤(1~100)이용해서 배열 크기 10 값 저장
		//2. 그 배열 총점. 평균 구하기
		
		double avg=0;
		int total=0;
		
		int[] arrNum = new int[10];  
		
		//1~100이 값을 랜덤하게 추출해서 저장
		for(int i=0; i<arrNum.length; i++) {
			int num = (int)(Math.random()*100)+1;
			arrNum[i] = num;
		}
		
		//배열 10개값 출력
		for(int i=0; i<arrNum.length; i++)
			System.out.print( arrNum[i] + " ");
		
		System.out.println("\n---------------------------------");
		
		// 배열 총점. 평균 구하기
		for(int i=0; i<arrNum.length; i++) 
			total += arrNum[i];
		
		avg = (double)total/arrNum.length;
		System.out.println("총점 : " + total + ", 평균 : " + avg);
		
		System.out.println("\n---------------------------------");
		System.out.println("\n---------------------------------");
		
		
		
		
		
		
	}

}
