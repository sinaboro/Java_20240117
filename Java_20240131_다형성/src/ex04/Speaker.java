package ex04;

/*
 * 영서 스피커 
 */
public class Speaker {
	   
	   private boolean button;
	   private int volume;
	   
	   Speaker(int volume) {
	      button = true;
	      this.volume = volume;
	   }
	   
	   public void on() {
	      button = true;
	      System.out.println("전원이 켜졌습니다");
	   }
	   
	   public void off() {
	      button = false;
	      System.out.println("전원이 꺼졌습니다");
	   }
	   
	   public void volumeUp() {
	      volume++;
	      System.out.println("볼륨 : " + volume);
	   }
	   
	   public void volumeDown() {
	      volume--;
	      System.out.println("볼륨 : " + volume);
	   }

	}
