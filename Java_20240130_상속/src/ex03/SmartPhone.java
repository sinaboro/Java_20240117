package ex03;

public class SmartPhone extends Phone{
	
	private boolean wifi;
	
	
	public SmartPhone() {
		System.out.println("SmartPhone()");
	}
	
	public SmartPhone(boolean wifi) {
		System.out.println("SmartPhone(boolean wifi)");
		this.wifi = wifi;
	}

	public SmartPhone(String model, String color, boolean wifi) {
		super(model, color); //상위클래스 생성자를 호출
		System.out.println(" String color, boolean wifi)");
		this.wifi = wifi;
	}
	
	@Override//어노테이션 sendVoice는 상위클래스를 재정의한다.
	public void sendVoice(String message) {
		System.out.println("음성메시지 : " + message);
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());  //상위클래스 toString 메소드 호출
		return "SmartPhone [wifi=" + wifi + "]";
	}

	public void internet() {
		System.out.println("인터넷 연결!!");
	}

	
	

	
	
	
	
	
	
	
	
	
	
	
}
