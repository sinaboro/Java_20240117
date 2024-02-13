package ex05;

class DBox<L, R>{
	
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}
public class MultiTypeGen {

	public static void main(String[] args) {
		
		DBox<String, Integer> box = new DBox<>();
		
		box.set("apple",10);
		System.out.println(box);
		
	}

}

/*
 * class DBox<L,R>{
	private String left;
	private Integer right;
	
	public void set(String  left, Integer right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}
 */
















