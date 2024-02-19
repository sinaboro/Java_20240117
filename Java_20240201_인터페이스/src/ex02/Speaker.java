package ex02;

/*
 * 틀만 스피커 
 */
public interface Speaker {  

	public void powerOn();
	
	public void powerOff();
	
	public void soundUp();
	
	public void soundDown();
	
	default public void 라디오수신기능() {
		System.out.println("라디오수신기능");
	};
	

}
