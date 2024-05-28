package ex06;

interface PrintVariable{
	void printVar(String name, int i);
}

public class Exam02 {

	public static void main(String[] args) {

		PrintVariable p = new PrintVariable() {
			@Override
			public void printVar(String name, int i) {
				System.out.println(name+"="+i);
			}
		};
		
		p.printVar("까미", 20);
	}

}
