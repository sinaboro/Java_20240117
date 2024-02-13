package ex09;

/*
 * Box 제네릭 클래스와 제네릭 메소드를 보고서
 * main 메소드를 채우시요. 
 * T타입은 String으로 한다.
 */
class Box<T>{   //T --> String
	private T obj;
	
	public Box() {}
	
	public Box(T obj){
		this.obj = obj;
	}
	
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
		
		Box<String> sbox = new Box();
		sbox.set("kor");
		
		String str = Unboxer.openBox(sbox);

		
		String str2 = Unboxer.openBox(new Box<String>("eng"));
		
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		
	}
}

































