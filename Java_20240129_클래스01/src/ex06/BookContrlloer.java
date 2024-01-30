package ex06;

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
		
		Book book3 = new Book("자바의정석","남궁성","몰라",10000);
		book3.displayBookInfo();
	}

}
