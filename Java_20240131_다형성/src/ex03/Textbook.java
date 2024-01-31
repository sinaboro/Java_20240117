package ex03;

public class Textbook extends Book{

	@Override
	String getDetails() {
		return super.getDetails() + " : 학문분야";
	}

	
}
