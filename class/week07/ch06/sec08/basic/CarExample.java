package week07.ch06.sec08.basic;

public class CarExample {

	public static void main(String[] args) {
		
		// 설계 그림 그릴 땐 얘부터 작성, 하고 클래스 생성
		
		//	Car 객체 생성
		Car myCar = new Car();	//객체 생성하는 부분 중요 그냥 컴파일이 가져와줘서 그냥 썼었음. 
		
		//Car 객체 필드 값 읽기.
		System.out.println("company: " + myCar.company);
		System.out.println("Model name:" + myCar.model);
		System.out.println("color: " + myCar.color);
		System.out.println("Max speed: " + myCar.maxSpeed);
		System.out.println("Currunt speed: "+ myCar.speed);
		
		// Car 객체의 필드 값 변경
		myCar.speed = 60;
		System.out.println("chaged speed: "+ myCar.speed);
		System.out.println();

		
		// 생성자 오버로딩
		Car car1 = new Car();
		System.out.println("company: " + myCar.company);
		System.out.println("Model name:" + myCar.model);
		System.out.println("color: " + myCar.color);
		System.out.println("Max speed: " + myCar.maxSpeed);
		
		Car car2 = new Car("wkrkdyd");	// 인자가 생겨서 
		System.out.println("company: " + myCar.company);
		System.out.println("Model name:" + myCar.model);
		System.out.println();
		System.out.println("Max speed: " + myCar.maxSpeed);
		
		Car car3 = new Car("wkrkdyd", "red");
		System.out.println("company: " + myCar.company);
		System.out.println("Model name:" + myCar.model);
		System.out.println("car3.color: " + myCar.color);
		System.out.println("");
		
		Car car4 = new Car("taxi", "black", 200);
		System.out.println("car4.company: " + myCar.company);
		System.out.println("Model name:" + myCar.model);
		System.out.println("color: " + myCar.color);
		System.out.println("Max speed: " + myCar.maxSpeed);
		
	}// 반환값이 있으면 메소드. 
}
