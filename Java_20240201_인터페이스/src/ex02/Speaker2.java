package ex02;

public class Speaker2 implements Speaker{

	   @Override
	   public void powerOn() {
	      System.out.println("전원을 켭니다");
	   }
	   @Override
	   public void powerOff() {
	      System.out.println("전원을 끕니다");
	   }
	   @Override
	   public void soundUp() {
	      System.out.println("소리를 올립니다");
	   }
	   @Override
	   public void soundDown() {
	      System.out.println("소리를 내립니다");
	   }
	   
	}