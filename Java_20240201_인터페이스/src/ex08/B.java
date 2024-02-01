package ex08;

public class B implements A {

	@Override
	public void method1() {
		System.out.println("B-method");
	}
}

class F implements A{

	@Override
	public void method1() {
		System.out.println("F-method");
	}
	
}