package ex02;

public class CompareTo {

	public static void main(String[] args) {
		System.out.println( compareEx("kor", "eng"));
		
		System.out.println( compareEx("kor", "math"));
		
		System.out.println( compareEx("kor", "kor"));
	}
	
	static int compareEx(String s1, String s2) {
		return s1.compareTo(s2);
	}

}
