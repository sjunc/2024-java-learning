package week07.ch06.sec08.basic;

public class CarExample {

	public static void main(String[] args) {
		
		// ���� �׸� �׸� �� ����� �ۼ�, �ϰ� Ŭ���� ����
		
		//	Car ��ü ����
		Car myCar = new Car();	//��ü �����ϴ� �κ� �߿� �׳� �������� �������༭ �׳� �����. 
		
		//Car ��ü �ʵ� �� �б�.
		System.out.println("company: " + myCar.company);
		System.out.println("Model name:" + myCar.model);
		System.out.println("color: " + myCar.color);
		System.out.println("Max speed: " + myCar.maxSpeed);
		System.out.println("Currunt speed: "+ myCar.speed);
		
		// Car ��ü�� �ʵ� �� ����
		myCar.speed = 60;
		System.out.println("chaged speed: "+ myCar.speed);
		System.out.println();

		
		// ������ �����ε�
		Car car1 = new Car();
		System.out.println("company: " + myCar.company);
		System.out.println("Model name:" + myCar.model);
		System.out.println("color: " + myCar.color);
		System.out.println("Max speed: " + myCar.maxSpeed);
		
		Car car2 = new Car("wkrkdyd");	// ���ڰ� ���ܼ� 
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
		
	}// ��ȯ���� ������ �޼ҵ�. 
}
