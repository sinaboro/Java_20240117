package ex01;

public class EqualEx01 {

	public static void main(String[] args) {

		String str1 = new String("korea");
		String str2 = new String("korea");
		
		System.out.println(str1  == str2); //주소값 비교
		
		System.out.println(str1.equals(str2)); //참조 주소 안 값을 비교
	}

}
