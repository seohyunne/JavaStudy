
public class Car {

	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	public Car() {};  // 기본 생성자
	
	public Car(String company, String model, String color, int maxSpeed, int speed) {
		super(); // 생략 가능
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}

	
	public static void main(String[] args) {

	}

}