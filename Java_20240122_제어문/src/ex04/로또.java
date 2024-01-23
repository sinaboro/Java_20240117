package ex04;

public class 로또 {

   public static void main(String[] args) {
	
	  //1~45 숫자 중에서 랜덤하게 6개 추출........
	
	  int [] lotto = new int[6];
	  boolean flag = false;
	      
	  for(int j=0; j<5; j++) {
	     //i =5
		  for (int i=0; i<lotto.length; i++) {
			flag = false;
	        int num = (int)(Math.random()*45)+1;
	        
	        for(int k=0; k<i; k++) {//i=5
	        	if(num == lotto[k]) { 
	        		flag = true;
	        		break;
	        	}
	        }
	        
	        if(flag) {
	        	i--;
	        	continue;
	        }
	        
	        lotto[i] = num;
	     }
	     
	     for(int i=0; i<lotto.length; i++) {
	        System.out.print(lotto[i] + " ");
	        
	     }
	     System.out.println("\n------------------");
	  }
   }
}
