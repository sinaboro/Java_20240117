package ex02;

public class MainClass {

	public static void main(String[] args) {
		
		doWork(new A());
		doWork(new B());
		doWork(new C());
	}
	
	static void doWork(A a) {
		
		if(a instanceof B) {
			B b = (B)a;
			b.fb();
		}else if(a instanceof C) {
			C c = (C)a;
			c.fc();
		}else {
			a.fa();
		}
	}
}
