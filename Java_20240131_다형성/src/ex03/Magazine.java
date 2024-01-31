package ex03;

public class Magazine extends Book{
	@Override
	String getDetails() {
		return super.getDetails() + " : 발행주기";
	}
}
