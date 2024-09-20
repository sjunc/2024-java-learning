package ch03.sec01;

public class SignOperaterExample {

	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y: " + y);
		
		int a = 1;
		a = a + 1;		//메모리 단위 연산
		++a;			// 비트 연산 속도가 빠름.

	}

}
