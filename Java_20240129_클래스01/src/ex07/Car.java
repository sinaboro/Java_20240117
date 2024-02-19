package ex07;

/*
 * 문제 4: 자동차 클래스 만들기
	클래스 이름: Car
	속성: make (제조사), model (모델), year (제조년도), color (색상)
	기능:
	startEngine(): 엔진을 켜는 메소드
	stopEngine(): 엔진을 끄는 메소드
	displayCarDetails(): 자동차의 모든 정보를 출력하는 메소드
	초기화 : setter 이용
 */
public class Car {

	private String make;
	private String model;
	private String year;
	private String color;
	
	
	
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEngine() {
		return engine;
	}

	public void setEngine(boolean engine) {
		this.engine = engine;
	}

	Car(){}
	
	Car(String m, String mo, String y, String c) {
		make = m;
		model = mo;
		year = y;
		color = c;
	}
	
	//생성자보다는 효율성 떨어진다..
	void setCar(String m, String mo, String y, String c) {
		make = m;
		model = mo;
		year = y;
		color = c;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + ", engine=" + engine
				+ "]";
	}

	void displayCarDetails() {
		System.out.println("제조사 : " + make);
		System.out.println("모델 : " + model);
		System.out.println("연식 : " + year);
		System.out.println("색상 : " + color);
	}
	
	
	private boolean engine;
	
	boolean startEngine(){
		return engine = true;
	}
	
	boolean stopEngine(){
		return engine = false;
	}
	
	
	
}
