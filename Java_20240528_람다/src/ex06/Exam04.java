package ex06;

interface RollA {
	int roll();
}

public class Exam04 {

	public static void main(String[] args) {

		RollA ro = new RollA() {
			
			@Override
			public int roll() {
				return (int)(Math.random() * 6);
			}
		};
		
		System.out.println(ro.roll());
	}

}
