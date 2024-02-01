package ex06;

import ex04.Ga;

public class Computer {

	
	Speaker sp = new ChildSpeaker();
	
		
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
