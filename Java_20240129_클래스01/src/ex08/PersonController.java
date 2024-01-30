package ex08;

public class PersonController {

	public static void main(String[] args) {
		
		
		//인스턴스 메소드는 객체를 생성한다음 참조변수로 접근 가능
		Person.staticShow();
		
		
		
		Person p1 = new Person();
		p1.showInfo();
		
		Person p2 = new Person();
		Person p3 = new Person();
		
		if(p2 == p3)
			System.out.println("같음");
		else
			System.out.println("틀림");
			
		
	}

}
