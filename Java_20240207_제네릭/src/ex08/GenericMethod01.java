package ex08;

class Box<T>{
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class BoxFactory{
	//제네릭 메소드==>   <T>:제네릭메소드 표시,
	//Box<T>: 반환타입, makeBox:함수명, (T o) : 매개변수
	
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}

/* Box<String> sBox = BoxFactory.makeBox("korea"); ==> 이문장이 전달되면
 * 대략 이렇게 생성된다.
public static <T> Box<String> makeBox(String o){
	Box<String> box = new Box<String>();
	box.set(o);
	return box;
} */

public class GenericMethod01 {

	public static void main(String[] args) {
		
//		Box<String> sBox = BoxFactory.<String>makeBox("korea");
		Box<String> sBox = BoxFactory.makeBox("korea");
		
		System.out.println(sBox.get());
		
		Box<Integer> iBox = BoxFactory.makeBox(100);
		System.out.println(iBox.get());
	}
}

/*
 * class Box<T>{
	private String obj;
	
	void set(String obj) {
		this.obj = obj;
	}

	String get() {
		return this.obj;
	}
}

class BoxFactory{
	
	//Box<T>: 반환타입, makeBox:함수명, (T o) : 매개변수
	public static <T> Box<String> makeBox(String  o){
		Box<String> box = new Box<String>();
		box.set(o);
		return box;
	}
}

Box<String> sBox = BoxFactory.<String>makeBox("korea");
 */




















