package ex01;

public class SmartPhone extends Phone{
	
	private boolean wifi;
	
	public SmartPhone() {
		System.out.println("SmartPhone()");
	}
	
	public SmartPhone(boolean wifi) {
		System.out.println("SmartPhone(boolean wifi)");
		this.wifi = wifi;
	}
	
	
	public void internet() {
		System.out.println("인터넷 연결!!");
	}
}
