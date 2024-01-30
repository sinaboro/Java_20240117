package ex09;

public class Singleton {

	private static Singleton singleton = new Singleton();

	
	public static Singleton getInstance() {
		
		//정적메소드 정적변수
		return singleton;
	}
}
