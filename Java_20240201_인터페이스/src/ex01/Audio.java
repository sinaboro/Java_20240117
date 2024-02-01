package ex01;

public class Audio implements RemoteControl{

	static int sum = 0; //인스턴스변수
	
	@Override
	public void turnOn() {
		System.out.println("스피커를 켭니다.");
	}

}
