package ex04;

public class 로또4 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
	      // int k;

	      for (int j = 0; j < 5; j++) {
	         System.out.println("\n----------------------");
	         for (int i = 0; i < lotto.length; i++) {
	            
	        	 int ran = (int) (Math.random() * 45) + 1;
	        	 int k=0;

	            for ( k = 0; k < i; k++) { // 중복체크
	               if (lotto[k] == ran)  break;
	            }

	            if (lotto[k] == ran) {
	            	 i--;
	            	continue;
	            }

	            lotto[i] = ran;

	            System.out.print(lotto[i] + " ");
	         }
	      }

	}

}
