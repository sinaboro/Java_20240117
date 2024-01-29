package ex05;

public class BookContrlloer {

	public static void main(String[] args) {

		Book book1 = new Book(
				"JAVA 기본",
				"송미영",
				30000
				);
		
		book1.displayBookInfo();
		
		System.out.println("--------------");
		Book book2 = new Book();
		book2.displayBookInfo();

		System.out.println("--------------");
		Book book3 = new Book();
		book3.displayBookInfo();
	}

}
