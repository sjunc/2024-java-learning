package week10.ch08Polymorphism;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		myCar.tire1 = new KunhoTire();
		myCar.tire2 = new KunhoTire();

		myCar.run();
	}

}
