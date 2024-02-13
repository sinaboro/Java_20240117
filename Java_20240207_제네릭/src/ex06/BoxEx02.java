package ex06;

class A{
	@Override
	public String toString() {
		return "A class"; 
	}
}
class B extends A{
	@Override
	public String toString() {
		return "B class"; 
	}
}
class C extends B{
	@Override
	public String toString() {
		return "C class"; 
	}
}

// A클래스 이거나 A를 상속한 클래스만 T 전달 가능!!!1
class Box<T extends A>{
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return  obj;
	}
}

class Apple{
	
}

public class BoxEx02 {

	public static void main(String[] args) {
		
		Box<A> abox = new Box<A>();
		Box<B> bbox = new Box<B>();
		Box<C> cbox = new Box<C>();
		
//		Box<Apple>  apbox = new Box<>();
		
//		Box<Integer> ibox = new Box<Integer>();
		
	}

}























