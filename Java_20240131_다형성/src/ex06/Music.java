package ex06;

public class Music extends Speaker {

	   public Music() {
	   }

	   @Override
	   public void powerOn() {
	      System.out.println("전원on.");
	   }
	   
	   @Override
	   public void powerOff() {
	      System.out.println("전원off.");
	   }
	   
	   @Override
	   public void soundUp() {
	      System.out.println("사운드up.");
	   }
	   
	   @Override
	   public void soundDown() {
	      System.out.println("사운드down.");
	   }
	   
	}
