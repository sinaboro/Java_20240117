package ex07;

public class CarController {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.displayCarDetails();
		
		car.setCar("그랜저", "현대", "2020", "흰색");
		System.out.println("--------------------");
		car.displayCarDetails();

		
		System.out.println("--------------------");
		car.setMake("기아");
		car.setModel("k8");
		car.displayCarDetails();

	}

}
