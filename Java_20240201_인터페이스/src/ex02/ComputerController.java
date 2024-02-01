package ex02;

public class ComputerController {

	public static void main(String[] args) {
		
		Speaker speark = new ChildSpeaker();
		
		speark.powerOn();
		speark.powerOff();
		speark.soundUp();
		speark.soundDown();
	}

}
