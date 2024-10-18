package week07.ch06.sec08.exam1;

public class Calculator {
	// 리턴 값이 없는 메소드 선언
	void powerOn() {
		System.out.println("System booting");
	}
	
	// 리턴 값이 없는 메소드 선언
	void powerOff() {
		System.out.println("System down");
	}
	
	// 호출시 두 정수 값을 전달 받고, 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result;	//리턴값 지정;

	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}

}
