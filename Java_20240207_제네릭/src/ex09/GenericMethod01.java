package ex09;

/*
 * Box 제네릭 클래스와 제네릭 메소드를 보고서
 * main 메소드를 채우시요. 
 * T타입은 String으로 한다.
 */
class Box<T>{   //T --> String
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
}


public class GenericMethod01 {

	public static void main(String[] args) {
		
		Box<String> sbox = new Box<String>();
		sbox.set("korea");
		
		String str = Unboxer.openBox(sbox);
		
		System.out.println(str);
	}
}




















