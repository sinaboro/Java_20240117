package ex04;

public class 로또2 {

	public static void main(String[] args) {
		
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++)
			lotto[i] = i+1;
		
		for(int i=0; i<10000; i++) {
			int num = (int)(Math.random()*44)+1; //1~44
			int tmp = lotto[0];
			lotto[0] = lotto[num];
			lotto[num] = tmp;
		}
		
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + " "); 

	}

}
