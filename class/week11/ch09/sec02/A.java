package week11.ch09.sec02;

public class A {
	//인스턴스 멤버 클래스
	class B{
		//인스턴스 필드
		int field1 = 1;
		
		// 정적 필드
		// static int field2 = 2;
		// static class가 아니여서 실행 불가
		
		// 생성자
		B(){
			System.out.println("B execute");
		}
		
		// 인스턴스 메소드
		void method1() {
			System.out.println("B method 1 execute");
		}
		// 정적 메소드
		//static void method2() {
		//	System.out.println("B method 2 execute");
		// }
	}
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		
	}

}
