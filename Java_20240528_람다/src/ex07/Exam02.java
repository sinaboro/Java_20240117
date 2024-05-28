package ex07;

import java.util.function.BiConsumer;

interface PrintVariable{
	void printVar(String name, int i);
}

public class Exam02 {

	public static void main(String[] args) {

		PrintVariable p = ( name, i) ->System.out.println(name+"="+i);
				
		
		p.printVar("까미", 20);
		
		System.out.println("----------------");
		
		BiConsumer<String, Integer> bc = 
			(name, i) ->System.out.println(name+"="+i);
			
		bc.accept("로이", 13);
		
	}

}
