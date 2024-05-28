package ex07;

interface PrintVariable{
	void printVar(String name, int i);
}

public class Exam02 {

	public static void main(String[] args) {

		PrintVariable p = ( name, i) ->System.out.println(name+"="+i);
				
		
		p.printVar("까미", 20);
	}

}
