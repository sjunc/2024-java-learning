package week10.ch08Typeschange;

public class CastingExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare();(X)
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();

	}

}
