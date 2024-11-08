package week09.calc;

public class Computer extends Calculator {

	@Override		//컴파일러에 오버라이드라고 지시
	public double areaCircle(double r) {
		System.out.println("Run object Computer areaCircle()");
		return Math.PI* r * r;
	}
}