package ex03;

public class Magazine extends Book{
	
	public Magazine(String title, String author, int year) {
		super(title, author, year);
	}
	
	@Override
	String getDetails() {
		return super.getDetails() + " : 발행주기";
	}
}
