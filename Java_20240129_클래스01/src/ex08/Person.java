package ex08;

public class Person {

	//정적변수,클래스변수
	private static int age;
	private static String name;
	
	//멤버변수, 인스턴스변수
	private String address;
	
	
	//메소드, 인스턴스메소드
	void showInfo() {
		System.out.println("인스턴스 메소드");
	}
	
	//정적메소드, 클래스메소드
	static void staticShow() {
		System.out.println("static 메소드");
		System.out.println(age);
		System.out.println(name);
//		System.out.println(address);
	}
	
}
