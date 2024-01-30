package ex02;

public class NewestPhone extends Phone{

	private boolean wifi;
	
	public NewestPhone() {
		System.out.println("NewestPhone");
	}
	public void internet() {
		System.out.println("인터넷 연결!!");
	}
	
	public void youtube() {
		System.out.println("유튜브 연결!!");
	}
}
