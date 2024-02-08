package ex07;

import java.util.concurrent.atomic.AtomicLong;

// Box 클래스를 통해서 생성되는 대상은 정수 및 실수만 클래스만 생성한다.
class Box<T extends Number>{
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return  obj;
	}
}

public class BoxEx02 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new Box<Integer>();
		Box<Double> dbox = new Box<Double>();
		Box<AtomicLong> atbox = new Box<AtomicLong>();
		Box<Short> sbox = new Box<Short>();
		
//		Box<String> sbox = new Box<String>(); 

		
	}

}























