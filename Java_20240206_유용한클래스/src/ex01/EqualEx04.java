package ex01;

public class EqualEx04 {

	public static void main(String[] args) {

		Box3 b1 = new Box3("korea");
		Box3 b2 = new Box3("korea");
		
		System.out.println("1 >> " + (b1 == b2));
		
		System.out.println("2 >> " + (b1.equals(b2)));
	}
}


class Box3{
	String str;
	
	public Box3(String str) {
		this.str = str;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Box3 b = (Box3)obj;
		return this.str.equals(b.str);
		
	//	return str.equals( ((Box3)obj).str);
		
	}
	
	
}














