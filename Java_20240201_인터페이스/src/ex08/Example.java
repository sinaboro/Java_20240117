package ex08;

public class Example {

	
	public static void action(A a) {
		a.method1();
		
	     // a참조변수가 참조하는 대상이 C클래스 이거나 C클래스 상속한 클래스이면 true반환 
		if(a instanceof C) {
			System.out.println("-----------");
			C c = new C();
			c.method2();
		}
			
		
		
	}
	
	public static void main(String[] args) {
//		action(new B());
		
//		action(new C());
		action(new F());
	}

}
