package ex03;

public class BookContrller {

	public static void main(String[] args) {
		
		details(new Textbook());
		details(new Magazine());
		details(new Novel());
	}

	static void details(Book book) {
		String msg = book.getDetails();
		System.out.println(msg);
	}
}
