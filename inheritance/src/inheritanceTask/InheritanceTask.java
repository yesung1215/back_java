package inheritanceTask;

class Car{
	String brand;
	String color;
	int price;
	
	public Car() {;}

	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("열쇠 시동 켜짐");
	}
	
	void engineStop() {
		System.out.println("열쇠 시동 꺼짐");
	}
}


class SuperCar extends Car{ // extends : 다준다
	String mode;
	public SuperCar() {;}
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 켬");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
	
	
}


public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar();
		Car matiz = new Car();
		
		matiz.engineStart();
		ferrari.engineStop();
	}
	
}
