package ex02;

public class Computer {

	
	Speaker3 sp = new Speaker3();
	
		
	void powerOn() {
		sp.powerOn();
	}

	void powerOff() {
		sp.soundUp();
	}
	
	void volumeUp() {
		sp.soundDown();
	}

	void volumeDown() {
		sp.powerOff();
	}
	
	
}
