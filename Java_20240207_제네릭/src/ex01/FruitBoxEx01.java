package ex01;

/*
 * 이 코드 문제점(?)
 * 1. AppleBox , OrangeBox 거이 비슷
 * 2. 한박스에 사과, 오렌지 담고 싶다.
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

class AppleBox{  //사과담는 상자
	private Apple ap;
	
	void setAp(Apple ap) {
		this.ap = ap;
	}
	
	Apple getAp(){
		return ap;
	}
}

class OrangeBox{  //오렌지 담는 상자
	private Orange op;
	
	void setOp(Orange op) {
		this.op = op;
	}
	
	Orange getOp(){
		return op;
	}
}


public class FruitBoxEx01 {

	public static void main(String[] args) {
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.setAp(new Apple());
//		aBox.setAp(10);
//		aBox.setAp("String");
				
		oBox.setOp(new Orange());
		
		System.out.println(aBox.getAp());
		System.out.println(oBox.getOp());
	}

}










