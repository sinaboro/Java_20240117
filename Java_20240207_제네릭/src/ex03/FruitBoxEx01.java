package ex03;

/*
 * 이 코드 문제점(?)
 * 1. 이 박스에는 사과, 오렌지만 담고싶은데..다른것이 담겨도 제거 불가
 * 2. get할 때 형변환 해야한다. (다운케스팅을 해야한다..)
 */

class Apple{  //사과
	public String toString() {
		return "I am an apple";
	}
}

class Orange{ //오렌지
	public String toString() {
		return "I am an Orange";
	}
}

class Box <T> {  //사과,오렌지 담는 상자
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj(){
		return obj;
	}
}

public class FruitBoxEx01 {

	public static void main(String[] args) {
		
		Box<Apple> abox = new Box<>(); //사과 박스
		
		Box<Orange> bbox = new Box<Orange>(); //오렌지 박스
		
		Box<Integer> ibox = new Box<Integer>();
		
//		abox.setObj(new Apple());  //사과 담음
//		abox.setObj(19);
//		abox.setObj("kor");
		
		bbox.setObj(new Orange()); //오렌지 담음
		
		Apple ap = abox.getObj();
		Orange op = bbox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
			
		ibox.setObj(100);
		int num = ibox.getObj();
				
	}

}

/*
 * class Box<T>{  //사과,오렌지 담는 상자
	private Apple obj;
	
	void setObj(Apple  obj) {
		this.obj = obj;
	}
	
	Apple  getObj(){
		return obj;
	}
}

class Box<T>{  //사과,오렌지 담는 상자
	private Orange obj;
	
	void setObj(Orange  obj) {
		this.obj = obj;
	}
	
	Orange  getObj(){
		return obj;
	}
}

class Box<T>{  //사과,오렌지 담는 상자
	private Integer obj;
	
	void setObj(Integer  obj) {
		this.obj = obj;
	}
	
	Integer  getObj(){
		return obj;
	}
}
 */









