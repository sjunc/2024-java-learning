package week07.ch06.sec10.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + " �� �޸��ϴ�.");
	}
	static void simulate() {
		//this.speed = 10;
		//speed = 20;
	
		Car myCar = new Car();
		myCar.speed = 200;
		myCar.run();
	}
	public static void main(String[] args) {
		// ���� �޼ҵ� ȣ��
		simulate();
	
	// ��ü ����
	Car myCar = new Car();
	//�ν��Ͻ� ��� ���
	myCar.speed = 60;
	myCar.run();
	
	}
}
