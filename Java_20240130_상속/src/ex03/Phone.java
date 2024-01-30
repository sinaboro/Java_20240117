package ex03;

public class Phone {
	
	private String model;
	private String color;
	
	public Phone() {
		System.out.println("Phone()");
	}

	public Phone(String model, String color) {
		System.out.println("Phone(String model, String color)");
		this.model = model;
		this.color = color;
	}
		
	@Override
	public String toString() {
		return "Phone [model=" + model + ", color=" + color + "]";
	}

	public void bell() {
		System.out.println("전화 벨이 울린다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("문자메시지 : " + message);
	}

	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	
}
