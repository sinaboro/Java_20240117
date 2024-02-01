package ex06;

/*
 * 틀만 스피커 
 */
public abstract class Speaker {  

	public Speaker() {
	}
	
	public abstract void powerOn();
	
	public abstract void powerOff();
	
	public abstract void soundUp();
	
	public abstract void soundDown();
	
	public void test() {
		System.out.println("test");
	}

}
