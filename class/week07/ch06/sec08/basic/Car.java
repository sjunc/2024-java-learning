package week07.ch06.sec08.basic;

public class Car {
	//필드 선언
	String company = "hyundai";
	String model = "granger";
	String color = "black";
	int maxSpeed = 350;
	int speed;
	// int 값 초기화
	
	//생성자 선언
	Car() {}
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed; 
	}

}
