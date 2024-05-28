package ex07;

import java.util.function.Function;
import java.util.function.Supplier;

interface RollA {
	int roll();
}

public class Exam04 {

	public static void main(String[] args) {

		RollA ro =  () -> (int)(Math.random() * 6);		
		
		System.out.println(ro.roll());
		
		System.out.println("------------------------------");
		
		Supplier<Integer> s = ()->(int)(Math.random() * 6);;
		
		System.out.println(s.get());
	}

}
