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
	}

	@Override
	public void powerOff() {
	}

	@Override
	public void soundUp() {
	}

	@Override
	public void soundDown() {
	}

	}