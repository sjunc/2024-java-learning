package week07.ch06.sec08.basic;

public class Car {
	//�ʵ� ����
	String company = "hyundai";
	String model = "granger";
	String color = "black";
	int maxSpeed = 350;
	int speed;
	// int �� �ʱ�ȭ
	
	//������ ����
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
