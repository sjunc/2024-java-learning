package week10.ch08Service;

public interface Service {

	
	// 디폴트 메소드 
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}
	//private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod1 종속 코드 A");
		System.out.println("defaultMethond 중복코드 B");
	}
	// 정적 메소드 
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	// private 정적 메소드
	private static void staticCommon() {
		System.out.println("defaultMethod1 종속 코드");
		System.out.println("staticMethod 중복코드 D");
	}

}
