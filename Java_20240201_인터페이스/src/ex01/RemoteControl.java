package ex01;

public interface RemoteControl {

//	public static final int MAX = 100;
	
	int MAX = 100;
	
	public void turnOn();
	
}


abstract class A{
	abstract void turnOff();
	
	void func1() {
		System.out.println("-----------");
	}
}


class B implements RemoteControl{

	@Override
	public void turnOn() {
	}
	
}