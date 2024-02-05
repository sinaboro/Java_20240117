package ex01;

public class Test2 {

	public static void main(String[] args) {
		
		Sample2 s2 = new Sample2();

		
		System.out.println(s2.a);
		
	}

}


class Sample2{
	int a;
	
	{
		a=10;
	}
	
	public Sample2() {
		a  = 100;
	}
}