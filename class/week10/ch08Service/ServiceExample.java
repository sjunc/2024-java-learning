package week10.ch08Service;

public class ServiceExample {

	public static void main(String[] args) {
		// 인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceImpl();
		
		// default method call
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		// static method call
		
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();

	}

}
