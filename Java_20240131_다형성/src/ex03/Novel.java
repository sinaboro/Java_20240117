package ex03;

public class Novel extends Book {
	@Override
	String getDetails() {
		return super.getDetails() + " : 장르";
	}
}
