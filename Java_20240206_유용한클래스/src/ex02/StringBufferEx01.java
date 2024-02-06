package ex02;

public class StringBufferEx01 {

	public static void main(String[] args) {
		
		StringBuffer sb = 
				new StringBuffer("kor").append("eng").append("math");
	
		
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}
