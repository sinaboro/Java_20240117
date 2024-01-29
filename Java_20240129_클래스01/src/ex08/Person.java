package ex08;

public class Person {

	private static int age;
	private static String name;
	
	void showInfo() {
		System.out.println("인스턴스 메소드");
	}
	
	
	static void staticShow() {
		System.out.println("static 메소드");
		System.out.println(age);
		System.out.println(name);
	}
	
}
