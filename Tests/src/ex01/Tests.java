package ex01;

class Person{
	String name;
	int age;
	
	public Person() {}
	
	public Person(Person p) {
		System.out.println("복사 생상자");
		this.name = p.name;
		this.age = p.age;
	}

	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("인자값 2개");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Tests {

	public static void main(String[] args) {
		
		Person p = new Person("조조", 20);	
		System.out.println("------------------");
		
		//Person p2 = p; 얕은복사
		Person p2 = new Person(p);  //깉은복사.
		
		
		p2.name = "장합";
		
		System.out.println(p);
		System.out.println(p2);
		
	}

}

