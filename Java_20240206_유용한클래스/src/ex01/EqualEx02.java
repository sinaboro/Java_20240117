package ex01;

public class EqualEx02 {

	public static void main(String[] args) {

		Box b1 = new Box("korea");
		Box b2 = new Box("korea");
		
		System.out.println("1 >> " + (b1 == b2));
		
		System.out.println("2 >> " + (b1.equals(b2)));
	}
}


class Box{
	String str;
	public Box(String str) {
		this.str = str;
	}
}
