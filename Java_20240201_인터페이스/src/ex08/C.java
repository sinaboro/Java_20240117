package ex08;

public class C implements A{

	@Override
	public void method1() {
		System.out.println("C-method");
	}
	
	public void method2() {
		System.out.println("C-method2");
	}

}

class D extends C{
	
}
