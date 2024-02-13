package ex10;

class Box<T>{   //T --> String
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T o){
		Box<T> box = new Box();
		box.set(o);
		
		System.out.println("Boxed : "+ o.doubleValue());
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("unboxed : " + (box.get().doubleValue()+1));
		return box.get();
	}
}


public class GenericMethod01 {

	public static void main(String[] args) {
		
		Box<Double> ibox = BoxFactory.<Double>makeBox(10.2);
		
		
		System.out.println("ibox : " + ibox.get());
		
		double num = Unboxer.openBox(ibox);
		System.out.println("data : " + num);
		
	}
}




















