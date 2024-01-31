package ex03;

public class Textbook extends Book{

	public Textbook(String title, String author, int year) {
		super(title, author, year);
	}
	
	@Override
	String getDetails() {
		return super.getDetails() + " : 학문분야";
	}

	
}
