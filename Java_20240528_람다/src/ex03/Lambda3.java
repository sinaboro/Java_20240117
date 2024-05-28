package ex03;


//@FunctionalInterface //함수형 인터페이스
interface Printable{
	void print(String msg);
    
	public static void print5() {};
	default void print2() {};
	default void print3() {};
	default void print4() {};
}


//람다를 만들수 있는 대상은 함수형 인터페이스만 가능(인터페이스 안에 추상메소드가 1개만존재)
public class Lambda3 {

	public static void main(String[] args) {		
	
		//Printable prn =	msg -> 	System.out.println(msg);

		//메소드 참조
		Printable prn =	System.out::println;
			
				
		prn.print("출력할 메시지2...............");
		
		
		
	}

}
