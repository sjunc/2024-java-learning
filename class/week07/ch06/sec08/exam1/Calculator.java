package week07.ch06.sec08.exam1;

public class Calculator {
	// ���� ���� ���� �޼ҵ� ����
	void powerOn() {
		System.out.println("System booting");
	}
	
	// ���� ���� ���� �޼ҵ� ����
	void powerOff() {
		System.out.println("System down");
	}
	
	// ȣ��� �� ���� ���� ���� �ް�, ȣ���� ������ ����� int�� �����ϴ� �޼ҵ� ����
	int plus(int x, int y) {
		int result = x + y;
		return result;	//���ϰ� ����;

	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}

}
