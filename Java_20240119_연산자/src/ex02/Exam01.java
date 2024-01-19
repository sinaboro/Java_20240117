package ex02;

public class Exam01 {

	public static void main(String[] args) {
		int a = 4;
		float b = 3;
		
		int c = (int)(++a + -b);  // 5 + -3.0; => 5.0 + -3.0; ++>  2.0 ++> (int)(2.0) ++ > 2
		System.out.println(c);
	}

}
