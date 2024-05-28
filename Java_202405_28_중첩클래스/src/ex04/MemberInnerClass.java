package ex04;

class Outer{
	
	private int num = 10;
	
	int get() {return num; }
	
	class Member{
		
		void add(int num) {
			Outer.this.num = num;
			
		}
		
		int get() { return num*2; }
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		
		Outer o1 = new Outer();
		System.out.println(o1.get());
		
		Outer.Member o1m1 = o1.new Member();
		int num =  o1m1.get();
		System.out.println(num);
		
		System.out.println("-------------");
		
		Outer.Member o1m2 = new Outer().new Member();
		System.out.println(o1m2.get());
	}

}
