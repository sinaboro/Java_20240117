package ex02;

public class ChildSpeaker implements Speaker{
	   
	   private boolean button;
	   private int volume;
	   
	   ChildSpeaker() {}
	   
	   ChildSpeaker(int volume) {
	      button = true;
	      this.volume = volume;
	   }
	   
	   @Override
	   public void powerOn() {
	      button = true;
	      System.out.println("전원이 켜졌습니다");
	   }
	   
	   @Override
	   public void powerOff() {
	      button = false;
	      System.out.println("전원이 꺼졌습니다");
	   }
	   
	   @Override
	   public void soundUp() {
	      volume++;
	      System.out.println("볼륨 : " + volume);
	   }
	   
	   @Override
	   public void soundDown() {
	      volume--;
	      System.out.println("볼륨 : " + volume);
	   }
	   
	   public void aiController(){
		   System.out.println("영서꺼..........");
	   }


	}