package ex10;

abstract class A{
	void func1() {
		System.out.println("func1");
	};
	
	//func2는 반드시 재정의해서 사용하세요....
	abstract void func2() ;
	
}

class B extends A{

	@Override
	void func2() {
	}
}


public class ATest {

	public static void main(String[] args) {
		
		B b = new B();
		b.func1();
	}

}
