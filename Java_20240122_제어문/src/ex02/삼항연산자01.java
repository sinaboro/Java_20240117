package ex02;

public class 삼항연산자01 {

	public static void main(String[] args) {
		
		int jumsu = 69;
		
		if(jumsu >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		//삼항 연산자 이용해서 변형
		
		String msg = ( jumsu >= 60 ) ? "합격" : "불합격";
		
		//String msg = "합격"  
		
		System.out.println(msg);

	}

}
