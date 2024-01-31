package ex03;

public class Novel extends Book {
	
	public Novel(String title, String author, int year) {
		super(title, author, year);
	}
	
	@Override
	String getDetails() {
		return super.getDetails() + " : 장르";
	}
}
