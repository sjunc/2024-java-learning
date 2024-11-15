package week10.ch08TypeChange;

public class PromotionExample {

	public static void main(String[] args) {
		// 구현 객체 생성
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 인터페이스 변수 선언
		A a;
		// a.printstate("0"); 인터페이스여서 실행 X
		
		/// 변수에 구현 객체 대입
		a = b;
		a.PrintState("B");
		
		a = c;
		a.PrintState("C");
		
		a = d;
		a.PrintState("D");
		
		a = e;
		e.PrintState("E");

	}

}
