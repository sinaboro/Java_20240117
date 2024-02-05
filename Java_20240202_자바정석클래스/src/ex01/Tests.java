package ex01;

public class Tests {

	public static void main(String[] args) {

		new Sample();
		new Sample();
		new Sample();
		new Sample();
		new Sample();
	
		System.out.println(Sample.count);
		
	}

}


class Sample{
	static int count;
	
	public Sample() {
		count++;
	}
}